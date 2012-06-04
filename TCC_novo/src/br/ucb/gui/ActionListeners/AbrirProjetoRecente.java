/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui.ActionListeners;

import br.ucb.beans.Projeto;
import br.ucb.gui.TelaInicio;
import br.ucb.gui.TelaPrimeira;
import br.ucb.service.Sessao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Hugo Arthur
 */
public class AbrirProjetoRecente implements ActionListener {

    private TelaPrimeira telaPrimeira;

    public AbrirProjetoRecente(TelaPrimeira telaPrima) {
        setTelaPrimeira(telaPrima);
        Sessao.getInstance().setProjeto(getProjeto());
        getTelaPrimeira().setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
    }

    public Projeto getProjeto() {
        int selectedIndex = getTelaPrimeira().getNomesProjetos().getSelectedIndex();
        Projeto projetoSelecionado = (Projeto) getTelaPrimeira().getNomesProjetos().getModel().getElementAt(selectedIndex);
        return projetoSelecionado;
    }

    public TelaPrimeira getTelaPrimeira() {
        return telaPrimeira;
    }

    public void setTelaPrimeira(TelaPrimeira telaPrimeira) {
        this.telaPrimeira = telaPrimeira;
    }
}
