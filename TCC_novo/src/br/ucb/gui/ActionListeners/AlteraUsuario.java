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
import javax.swing.JOptionPane;

/**
 *
 * @author uc07053438
 */
public class AlteraUsuario implements ActionListener {

    private TelaAlteraUsuario telaAltera;
    private Usuario usuario;
    private StringBuilder mensagemErro;

    public AlteraUsuario(TelaAlteraUsuario form, Usuario usuario) {
        setTelaAltera(form);
        setUsuario(usuario);
        alteraUsuario();
    }

    public void actionPerformed(ActionEvent e) {
//        alteraUsuarioCoordenador();
        //getTelaAltera().update(null);
    }

    public void alteraUsuario() {
        if (!validaCampoObrigadorios()) {
            getUsuario().setNome(getTelaAltera().getNomeTextField().getText());
            getUsuario().setUniversidade((String) getTelaAltera().getUniversidadeComboBox().getSelectedItem());
            if (getTelaAltera().getjRadioButton5().isSelected()) {
                getUsuario().setTipoUsuario(Constants.COORDENADOR);
            } else {
                getUsuario().setTipoUsuario(Constants.EQUIPE);
            }
            getUsuario().setLogin(getTelaAltera().getLoginTextField().getText());
            UsuarioDAO.alteraUsuario(getUsuario());
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            getTelaAltera().dispose();
        } else {
            JOptionPane.showMessageDialog(null, mensagemErro.toString(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
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

    public boolean validaCampoObrigadorios() {
        boolean erro = false;
        if (getTelaAltera().getNomeTextField().getText().isEmpty()) {
            mensagemErro.append("O nome é um campo obrigatório!\n");
            erro = true;
        }
        if (!getTelaAltera().getjRadioButton5().isSelected() && !getTelaAltera().getjRadioButton6().isSelected()) {
            getMensagemErro().append("É necessário informar um tipo de usuário.\n");
            erro = true;
        }
        if (getTelaAltera().getLoginTextField().getText().isEmpty()) {
            mensagemErro.append("O login é um campo obrigatório!\n");
            erro = true;
        }
        return erro;
    }

    public StringBuilder getMensagemErro() {
        return mensagemErro;
    }

    public void setMensagemErro(StringBuilder mensagemErro) {
        this.mensagemErro = mensagemErro;
    }
}
