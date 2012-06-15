/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author GUICUNHA
 */
@Entity
@Table(name = "projeto")
public class Projeto implements Serializable {

    @Column(name = "id_projeto")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProjeto;
    @Column(name = "nom_projeto")
    private String nomeProjeto;
    @Column(name = "data_projeto")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataProjeto;
    @Lob
    @Column(name = "arquivo_xml")
    private String arquivoXml;
    @ManyToMany(mappedBy = "projetos")
    private List<Usuario> usuarios;
    @ManyToOne
    private Acompanhamento acompanhamento;
    @Column(name = "status")
    private String status;

    public Projeto() {
        this.usuarios = new ArrayList<Usuario>();
    }

    /**
     * @return the idProjeto
     */
    public Integer getIdProjeto() {
        return idProjeto;
    }

    /**
     * @param idProjeto the idProjeto to set
     */
    public void setIdProjeto(Integer idProjeto) {
        this.idProjeto = idProjeto;
    }

    /**
     * @return the nomeProjeto
     */
    public String getNomeProjeto() {
        return nomeProjeto;
    }

    /**
     * @param nomeProjeto the nomeProjeto to set
     */
    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    /**
     * @return the dataProjeto
     */
    public Date getDataProjeto() {
        return dataProjeto;
    }

    /**
     * @param dataProjeto the dataProjeto to set
     */
    public void setDataProjeto(Date dataProjeto) {
        this.dataProjeto = dataProjeto;
    }

    public String getArquivoXml() {
        return arquivoXml;
    }

    public void setArquivoXml(String arquivoXml) {
        this.arquivoXml = arquivoXml;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Acompanhamento getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(Acompanhamento acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    @Override
    public String toString() {
        return this.getNomeProjeto();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
