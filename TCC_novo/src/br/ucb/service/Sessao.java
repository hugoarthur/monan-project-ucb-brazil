/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.service;

import br.ucb.beans.Usuario;

/**
 *
 * @author Hugo Arthur
 */
public class Sessao {

    private static Sessao instance = null;
    private Usuario usuario;

    private Sessao() {
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public static Sessao getInstance() {
        if (instance == null) {
            instance = new Sessao();
        }
        return instance;
    }
}
