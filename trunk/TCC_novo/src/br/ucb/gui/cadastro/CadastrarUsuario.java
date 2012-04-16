/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui.cadastro;

import br.ucb.beans.Usuario;
import br.ucb.dao.UsuarioDAO;
import br.ucb.gui.TelaCadastroUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Hugo Arthur
 */
public class CadastrarUsuario implements ActionListener {

    private TelaCadastroUsuario telaCadastro;

    public CadastrarUsuario(TelaCadastroUsuario form) {
        setTelaCadastro(form);
        insereUsuario();
    }

    public void actionPerformed(ActionEvent e) {
        insereUsuario();
        //getTelaCadastro().update(null);
    }

    public void insereUsuario(){
        Usuario user = new Usuario();
        user.setNome(getTelaCadastro().getNomeTextField().getText());
        user.setLogin(getTelaCadastro().getLoginTextField().getText());
        user.setSenha(new String(getTelaCadastro().getSenhaSenhaPasswordField().getPassword()));
        user.setUniversidade((String)getTelaCadastro().getUniversidadeComboBox().getSelectedItem());
        UsuarioDAO.insereUsuario(user);
    }

    public TelaCadastroUsuario getTelaCadastro() {
        return telaCadastro;
    }

    public void setTelaCadastro(TelaCadastroUsuario telaCadastro) {
        this.telaCadastro = telaCadastro;
    }
}
