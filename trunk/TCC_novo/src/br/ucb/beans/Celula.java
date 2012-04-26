/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ucb.beans;

import javax.persistence.*;

/**
 *
 * @author GUICUNHA
 */

@Entity
@Table(name="celula")
public class Celula {
    @Column(name="id_celula")
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idCelula;
    @Column(name="txt_celula")
    private String txt_celula;

    /**
     * @return the idCelula
     */
    public Integer getIdCelula() {
        return idCelula;
    }

    /**
     * @param idCelula the idCelula to set
     */
    public void setIdCelula(Integer idCelula) {
        this.idCelula = idCelula;
    }

    /**
     * @return the txt_celula
     */
    public String getTxt_celula() {
        return txt_celula;
    }

    /**
     * @param txt_celula the txt_celula to set
     */
    public void setTxt_celula(String txt_celula) {
        this.txt_celula = txt_celula;
    }

   
   
}
