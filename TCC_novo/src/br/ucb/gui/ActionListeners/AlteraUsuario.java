/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui.ActionListeners;

import br.ucb.beans.Usuario;
import br.ucb.constants.Constants;
import br.ucb.dao.UsuarioDAO;
import br.ucb.gui.TelaAlteraUsuario;
import br.ucb.gui.TelaCadastroUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author uc07053438
 */
public class AlteraUsuario implements ActionListener{
    private TelaAlteraUsuario telaAltera;
    private Usuario usuario;

    public AlteraUsuario(TelaAlteraUsuario form, Usuario usuario) {
        setTelaAltera(form);
        setUsuario(usuario);
        alteraUsuarioCoordenador();
        getTelaAltera().setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
        if(getTelaAltera().getName() == "TelaCadastroUsuario")
            alteraUsuarioCoordenador();
        else
            alteraUsuarioEquipe();
        //getTelaAltera().update(null);
    }

    public void alteraUsuarioCoordenador(){
        getUsuario().setNome(getTelaAltera().getNomeTextField().getText());
        getUsuario().setLogin(getTelaAltera().getLoginTextField().getText());
        getUsuario().setSenha(new String(getTelaAltera().getSenhaSenhaPasswordField().getPassword()));
        getUsuario().setUniversidade((String)getTelaAltera().getUniversidadeComboBox().getSelectedItem());
        getUsuario().setTipoUsuario(Constants.COORDENADOR);
        UsuarioDAO.alteraUsuario(getUsuario());
    }
    
    public void alteraUsuarioEquipe(){
        getUsuario().setNome(getTelaAltera().getNomeTextField().getText());
        getUsuario().setLogin(getTelaAltera().getLoginTextField().getText());
        getUsuario().setSenha(new String(getTelaAltera().getSenhaSenhaPasswordField().getPassword()));
        getUsuario().setUniversidade((String)getTelaAltera().getUniversidadeComboBox().getSelectedItem());
        getUsuario().setTipoUsuario(Constants.EQUIPE);
        UsuarioDAO.alteraUsuario(getUsuario());
    }

    public TelaAlteraUsuario getTelaAltera() {
        return telaAltera;
    }

    public void setTelaAltera(TelaAlteraUsuario telaAltera) {
        this.telaAltera = telaAltera;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
