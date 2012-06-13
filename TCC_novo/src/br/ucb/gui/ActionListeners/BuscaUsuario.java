/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui.ActionListeners;

import br.ucb.beans.Usuario;
import br.ucb.dao.UsuarioDAO;
import br.ucb.gui.TelaLogin;
import br.ucb.gui.TelaPrimeira;
import br.ucb.service.Sessao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

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
    }

    public void buscaUsuario() {
        StringBuilder mensagemErro = new StringBuilder();
        boolean erro = false;
        if (getTelaLogin().getLoginTextField().getText().isEmpty()) {
            mensagemErro.append("O login precisa ser informado!\n");
            erro = true;
        }
        if (getTelaLogin().getSenhaPasswordField().getPassword().length == 0) {
            mensagemErro.append("A senha precisa ser informada!\n");
            erro = true;
        }
        if (!erro) {
            Usuario user = UsuarioDAO.buscaUsuario(getTelaLogin().getLoginTextField().getText(),
                    new String(getTelaLogin().getSenhaPasswordField().getPassword()));
            if (user != null) {
                Sessao sessao = Sessao.getInstance();
                sessao.setUsuario(user);
                getTelaLogin().dispose();
                new TelaPrimeira().setVisible(true);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, mensagemErro.toString(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
        getTelaLogin().getSenhaPasswordField().setText("");
    }

    public TelaLogin getTelaLogin() {
        return telaLogin;
    }

    public void setTelaLogin(TelaLogin telaLogin) {
        this.telaLogin = telaLogin;
    }
}
