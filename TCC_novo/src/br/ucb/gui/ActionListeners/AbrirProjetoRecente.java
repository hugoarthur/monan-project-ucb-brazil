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
import javax.swing.JOptionPane;

/**
 *
 * @author Hugo Arthur
 */
public class AbrirProjetoRecente implements ActionListener {

    private TelaPrimeira telaPrimeira;

    public AbrirProjetoRecente(TelaPrimeira telaPrima) {
        setTelaPrimeira(telaPrima);
        if (getProjeto() != null) {
            Sessao.getInstance().setProjeto(getProjeto());
            getTelaPrimeira().dispose();
            TelaInicio telaInicio = new TelaInicio();
            telaInicio.setVisible(true);
            Sessao.getInstance().setTela(telaInicio);
        } else {
            JOptionPane.showMessageDialog(null, "Você não selecionou nenhum projeto!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void actionPerformed(ActionEvent e) {
    }

    public Projeto getProjeto() {
        Projeto projetoSelecionado = null;
        try {
            int selectedIndex = getTelaPrimeira().getNomesProjetos().getSelectedIndex();
            projetoSelecionado = (Projeto) getTelaPrimeira().getNomesProjetos().getModel().getElementAt(selectedIndex);
            return projetoSelecionado;
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            return projetoSelecionado;
        }
    }

    public TelaPrimeira getTelaPrimeira() {
        return telaPrimeira;
    }

    public void setTelaPrimeira(TelaPrimeira telaPrimeira) {
        this.telaPrimeira = telaPrimeira;
    }
}
