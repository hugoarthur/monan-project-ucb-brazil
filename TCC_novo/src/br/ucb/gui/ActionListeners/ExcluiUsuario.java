/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui.ActionListeners;

import br.ucb.beans.Usuario;
import br.ucb.dao.UsuarioDAO;
import br.ucb.gui.TelaExcluiUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Osmar jr
 */
public class ExcluiUsuario implements ActionListener {

    private TelaExcluiUsuario telaExcluiUsu = new TelaExcluiUsuario();

    public ExcluiUsuario(TelaExcluiUsuario form) {

        setTelaLogin(form);
        buscaUser();

    }

    public void actionPerformed(ActionEvent e) {
    }

    public void buscaUser() {

        Usuario user = UsuarioDAO.buscaUsuario(getTelaExcluiUsuario().getLoginTextField().getText(),
                new String(getTelaExcluiUsuario().getSenhaPasswordField().getPassword()));
        if (user != null) {
            UsuarioDAO.excluiUsuario(Integer.SIZE);
        }

    }

    public TelaExcluiUsuario getTelaExcluiUsuario() {
        return telaExcluiUsu;
    }

    public void setTelaLogin(TelaExcluiUsuario telaExclui) {
        this.telaExcluiUsu = telaExclui;
    }
}
