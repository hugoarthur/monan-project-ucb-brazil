/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.beans;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Hugo Arthur
 */
@Entity
@Table(name = "situacao")
public class Situacao implements Serializable {

    @Column(name = "id_situcao")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSituacao;
    @Column(name = "des_situacao")
    private String desSituacao;
    @ManyToOne
    @JoinColumn(name = "id_projeto", nullable = false)
    private Projeto projeto;
//    @ManyToOne
//    private Acompanhamento acompanhamento;
//
//    public Acompanhamento getAcompanhamento() {
//        return acompanhamento;
//    }
//
//    public void setAcompanhamento(Acompanhamento acompanhamento) {
//        this.acompanhamento = acompanhamento;
//    }

    public String getDesSituacao() {
        return desSituacao;
    }

    public void setDesSituacao(String desSituacao) {
        this.desSituacao = desSituacao;
    }

    public Integer getIdSituacao() {
        return idSituacao;
    }

    public void setIdSituacao(Integer idSituacao) {
        this.idSituacao = idSituacao;
    }

    /**
     * @return the projeto
     */
    public Projeto getProjeto() {
        return projeto;
    }

    /**
     * @param projeto the projeto to set
     */
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}
