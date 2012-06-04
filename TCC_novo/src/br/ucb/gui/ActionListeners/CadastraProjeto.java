/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui.ActionListeners;

import br.ucb.beans.Projeto;
import br.ucb.constants.Constants;
import br.ucb.dao.ProjetoDAO;
import br.ucb.gui.TelaInicio;
import br.ucb.gui.TelaNovoProjeto;
import br.ucb.service.Sessao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 *
 * @author Hugo Arthur
 */
public class CadastraProjeto implements ActionListener {

    private TelaNovoProjeto telaNovoProjeto;
    
    public CadastraProjeto(TelaNovoProjeto form) {
        setTelaNovoProjeto(form);
        insereProjeto();
        getTelaNovoProjeto().setVisible(false);
    }
        public void actionPerformed(ActionEvent e) {
        insereProjeto();
        //getTelaCadastro().update(null);
    }

    public void insereProjeto() {
        Projeto projeto = new Projeto();
        projeto.setNomeProjeto(getTelaNovoProjeto().getjTextField1().getText());
        if(Sessao.getInstance().getUsuario().getTipoUsuario() == Constants.COORDENADOR)
            projeto.getUsuarios().add(Sessao.getInstance().getUsuario());
        projeto.setDataProjeto(new Date());
        ProjetoDAO.insereProjeto(projeto);
        Sessao.getInstance().setProjeto(projeto);
    }

    public TelaNovoProjeto getTelaNovoProjeto() {
        return telaNovoProjeto;
    }

    public void setTelaNovoProjeto(TelaNovoProjeto telaNovoProjeto) {
        this.telaNovoProjeto = telaNovoProjeto;
    }
    
}
