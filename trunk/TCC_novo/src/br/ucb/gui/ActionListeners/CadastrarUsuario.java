/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui.ActionListeners;

import br.ucb.beans.Projeto;
import br.ucb.beans.Usuario;
import br.ucb.constants.Constants;
import br.ucb.dao.ProjetoDAO;
import br.ucb.dao.UsuarioDAO;
import br.ucb.gui.TelaCadastroUsuario;
import br.ucb.service.Sessao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Hugo Arthur
 */
public class CadastrarUsuario implements ActionListener {

    private TelaCadastroUsuario telaCadastro;
    private StringBuilder mensagemErro;

    public CadastrarUsuario(TelaCadastroUsuario form) {
        setTelaCadastro(form);
        setMensagemErro(new StringBuilder());
        insereUsuario();
    }

    public void actionPerformed(ActionEvent e) {
        //getTelaCadastro().update(null);
    }

    public void insereUsuario() {
        if (!validaCampoObrigadorios()) {
            Usuario user = new Usuario();
            user.setNome(getTelaCadastro().getNomeTextField().getText());
            user.setLogin(getTelaCadastro().getLoginTextField().getText());
            user.setSenha(new String(getTelaCadastro().getSenhaSenhaPasswordField().getPassword()));
            user.setUniversidade((String) getTelaCadastro().getUniversidadeComboBox().getSelectedItem());
            if (getTelaCadastro().getjRadioButton1().isSelected()) {
                user.setTipoUsuario(Constants.COORDENADOR);
            } else {
                user.setTipoUsuario(Constants.EQUIPE);
                user.setProjetos(Sessao.getInstance().getUsuario().getProjetos());
//                for (Projeto proj : Sessao.getInstance().getUsuario().getProjetos()) {
//                    proj.getUsuarios().add(user);
//                    ProjetoDAO.alteraProjeto(proj);
//                }
            }
            UsuarioDAO.insereUsuario(user);
            getTelaCadastro().dispose();
        } else {
            JOptionPane.showMessageDialog(null, mensagemErro.toString(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public TelaCadastroUsuario getTelaCadastro() {
        return telaCadastro;
    }

    public void setTelaCadastro(TelaCadastroUsuario telaCadastro) {
        this.telaCadastro = telaCadastro;
    }

    public StringBuilder getMensagemErro() {
        return mensagemErro;
    }

    public void setMensagemErro(StringBuilder mensagemErro) {
        this.mensagemErro = mensagemErro;
    }

    public boolean validaCampoObrigadorios() {
        boolean erro = false;
        if (getTelaCadastro().getNomeTextField().getText().isEmpty()) {
            mensagemErro.append("O nome é um campo obrigatório!\n");
            erro = true;
        }
        if (!getTelaCadastro().getjRadioButton1().isSelected() && !getTelaCadastro().getjRadioButton2().isSelected()) {
            getMensagemErro().append("É necessário informar um tipo de usuário.\n");
            erro = true;
        }
        if (getTelaCadastro().getLoginTextField().getText().isEmpty()) {
            mensagemErro.append("O login é um campo obrigatório!\n");
            erro = true;
        }
        if (getTelaCadastro().getSenhaPasswordField().getPassword().length == 0) {
            mensagemErro.append("A senha é um campo obrigatório!\n");
            erro = true;
        }
        return erro;
    }
}
