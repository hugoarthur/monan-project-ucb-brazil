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
 * @author Hugo Arthur
 */
@Entity
@Table(name = "acompanhamento")
public class Acompanhamento implements Serializable {

    @Column(name = "id_acompanhamento")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAcompanhamento;
    @Column(name = "data_acompanhamento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAcompanhamento;
    @Column(name = "txt_acompanhamento")
    private String txtAcompanhamento;
    @OneToMany(mappedBy = "acompanhamento", fetch = FetchType.LAZY)
    private List<Celula> celulas;
    @OneToMany(mappedBy = "acompanhamento", fetch = FetchType.LAZY)
    private List<Projeto> projetos;
    @OneToMany(mappedBy = "acompanhamento", fetch = FetchType.LAZY)
    private List<Situacao> situacoes;

    public Acompanhamento() {
        this.projetos = new ArrayList<Projeto>();
    }

    public Date getDataAcompanhamento() {
        return dataAcompanhamento;
    }

    public void setDataAcompanhamento(Date dataAcompanhamento) {
        this.dataAcompanhamento = dataAcompanhamento;
    }

    public Integer getIdAcompanhamento() {
        return idAcompanhamento;
    }

    public void setIdAcompanhamento(Integer idAcompanhamento) {
        this.idAcompanhamento = idAcompanhamento;
    }

    public String getTxtAcompanhamento() {
        return txtAcompanhamento;
    }

    public void setTxtAcompanhamento(String txtAcompanhamento) {
        this.txtAcompanhamento = txtAcompanhamento;
    }

    public List<Celula> getCelulas() {
        return celulas;
    }

    public void setCelulas(List<Celula> celulas) {
        this.celulas = celulas;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }

    public List<Situacao> getSituacoes() {
        return situacoes;
    }

    public void setSituacoes(List<Situacao> situacoes) {
        this.situacoes = situacoes;
    }
}
