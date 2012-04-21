/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.beans;

import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author GUICUNHA
 */
@Entity
@Table(name = "projeto")
public class Projeto {

    @Column(name = "id_projeto")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProjeto;
    @Column(name = "nom_projeto")
    private String nomeProjeto;
    @Column(name = "data_projeto")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataProjeto;
    @OneToOne
    @JoinColumn(name = "usuario_id_usuario", unique=true, nullable=false)
    private Usuario usuario;

    public Projeto() {
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
