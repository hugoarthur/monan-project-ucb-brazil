/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui.cadastro;

import br.ucb.beans.Usuario;
import br.ucb.dao.UsuarioDAO;
import br.ucb.gui.TelaLogin;
import br.ucb.gui.TelaPrimeira;
import br.ucb.service.Sessao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Hugo Arthur
 */
public class BuscaUsuario implements ActionListener {

    private TelaLogin telaLogin;

    public BuscaUsuario(TelaLogin form) {
        setTelaLogin(form);
        buscaUsuario();
    }

    public void actionPerformed(ActionEvent e) {
        buscaUsuario();
        //getTelaCadastro().update(null);
    }

    public void buscaUsuario() {
        Usuario user = UsuarioDAO.buscaUsuario(getTelaLogin().getLoginTextField().getText(),
                new String(getTelaLogin().getSenhaPasswordField().getPassword()));
        if(user != null){
            Sessao sessao = Sessao.getInstance();
            sessao.setUsuario(user);
            getTelaLogin().setVisible(false);
            new TelaPrimeira().setVisible(true);
        }
    }

    public TelaLogin getTelaLogin() {
        return telaLogin;
    }

    public void setTelaLogin(TelaLogin telaLogin) {
        this.telaLogin = telaLogin;
    }

    
}
