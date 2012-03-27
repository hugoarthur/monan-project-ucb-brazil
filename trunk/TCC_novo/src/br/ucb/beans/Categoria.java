/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ucb.beans;

/**
 *
 * @author GUICUNHA
 */
public class Categoria {
    private Integer idCategoria;
    private String txt_categoria;

    /**
     * @return the idCategoria
     */
    public Integer getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * @return the txt_categoria
     */
    public String getTxt_categoria() {
        return txt_categoria;
    }

    /**
     * @param txt_categoria the txt_categoria to set
     */
    public void setTxt_categoria(String txt_categoria) {
        this.txt_categoria = txt_categoria;
    }
}
