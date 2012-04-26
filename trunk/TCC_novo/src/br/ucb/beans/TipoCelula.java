/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ucb.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author GUICUNHA
 */

@Entity
@Table(name="tipo_celula")
public class TipoCelula {
    @Column(name="id_tipo_celula")
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_tipo_celula;
    @Column(name="nom_tipo_celula")
    private String nom_tipo_celula;

    /**
     * @return the id_tipo_celula
     */
    public Integer getId_tipo_celula() {
        return id_tipo_celula;
    }

    /**
     * @param id_tipo_celula the id_tipo_celula to set
     */
    public void setId_tipo_celula(Integer id_tipo_celula) {
        this.id_tipo_celula = id_tipo_celula;
    }

    /**
     * @return the nom_tipo_celula
     */
    public String getNom_tipo_celula() {
        return nom_tipo_celula;
    }

    /**
     * @param nom_tipo_celula the nom_tipo_celula to set
     */
    public void setNom_tipo_celula(String nom_tipo_celula) {
        this.nom_tipo_celula = nom_tipo_celula;
    }

    

}
