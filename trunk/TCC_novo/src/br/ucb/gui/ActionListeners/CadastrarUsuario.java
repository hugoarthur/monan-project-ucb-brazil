/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui.ActionListeners;

import br.ucb.beans.Usuario;
import br.ucb.constants.Constants;
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
        insereUsuarioCoordenador();
        getTelaCadastro().setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
        if(getTelaCadastro().getName() == "TelaCadastroUsuario")
            insereUsuarioCoordenador();
        else
            insereUsuarioEquipe();
        //getTelaCadastro().update(null);
    }

    public void insereUsuarioCoordenador(){
        Usuario user = new Usuario();
        user.setNome(getTelaCadastro().getNomeTextField().getText());
        user.setLogin(getTelaCadastro().getLoginTextField().getText());
        user.setSenha(new String(getTelaCadastro().getSenhaSenhaPasswordField().getPassword()));
        user.setUniversidade((String)getTelaCadastro().getUniversidadeComboBox().getSelectedItem());
        user.setTipoUsuario(Constants.COORDENADOR);
        UsuarioDAO.insereUsuario(user);
    }
    
    public void insereUsuarioEquipe(){
        Usuario user = new Usuario();
        user.setNome(getTelaCadastro().getNomeTextField().getText());
        user.setLogin(getTelaCadastro().getLoginTextField().getText());
        user.setSenha(new String(getTelaCadastro().getSenhaSenhaPasswordField().getPassword()));
        user.setUniversidade((String)getTelaCadastro().getUniversidadeComboBox().getSelectedItem());
        user.setTipoUsuario(Constants.EQUIPE);
        UsuarioDAO.insereUsuario(user);
    }

    public TelaCadastroUsuario getTelaCadastro() {
        return telaCadastro;
    }

    public void setTelaCadastro(TelaCadastroUsuario telaCadastro) {
        this.telaCadastro = telaCadastro;
    }
}
