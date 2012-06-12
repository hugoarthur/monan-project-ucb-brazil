/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui.ActionListeners;

import br.ucb.beans.Projeto;
import br.ucb.gui.TelaProjeto;
import br.ucb.service.Sessao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author GUICUNHA
 */
public class AbrirAlteraProjeto implements ActionListener {

    private TelaProjeto telaProjeto;

    public AbrirAlteraProjeto(TelaProjeto telaProjeto) {
        setTelaProjeto(telaProjeto);
        Sessao.getInstance().setProjeto(getProjeto());
        getTelaProjeto().setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
    }

    public Projeto getProjeto() {
        int selectedIndex = getTelaProjeto().getNomesProjetos().getSelectedIndex();
        Projeto projetoSelecionado = (Projeto) getTelaProjeto().getNomesProjetos().getModel().getElementAt(selectedIndex);
        return projetoSelecionado;
    }

    /**
     * @return the telaProjeto
     */
    public TelaProjeto getTelaProjeto() {
        return telaProjeto;
    }

    /**
     * @param telaProjeto the telaProjeto to set
     */
    public void setTelaProjeto(TelaProjeto telaProjeto) {
        this.telaProjeto = telaProjeto;
    }

    
}
