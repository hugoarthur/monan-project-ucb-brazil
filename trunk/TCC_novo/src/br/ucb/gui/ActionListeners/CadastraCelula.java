/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui.ActionListeners;

import br.ucb.beans.Celula;
import br.ucb.dao.CelulaDAO;
import br.ucb.gui.TelaInicio;
import br.ucb.gui.TelaNovaCelula;
import br.ucb.service.Sessao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author uc08067807
 */
public class CadastraCelula implements ActionListener {

    private TelaNovaCelula telaCadastraCelula;
    private TelaInicio telaIni = new TelaInicio();
    Celula celula = new Celula();

    public CadastraCelula(TelaNovaCelula form) {
        setTelaCadastraCelula(form);
        celula.setTxt_celula(getTelaCadastraCelula().getTxtField().getText());
        if (!validaCelula(celula)) {
            insereCelula();
            getTelaCadastraCelula().dispose();
            TelaInicio tela = (TelaInicio) Sessao.getInstance().getTela();
            tela.setCombo();
        }
    }

    public void actionPerformed(ActionEvent e) {
//        insereCelula();
        //getTelaCadastro().update(null);
    }

    public void insereCelula() {
        CelulaDAO.insereCelula(celula);
        telaIni.setCombo();
    }

    public boolean validaCelula(Celula celula) {
        if (celula.getTxt_celula().isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigatório informar o nome da célula!", "Warning", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        List<Celula> celulas = CelulaDAO.findAll();
        if (celulas.contains(celula)) {
            JOptionPane.showMessageDialog(null, "Célula já cadastrada!", "Warning", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }

    public TelaNovaCelula getTelaCadastraCelula() {
        return telaCadastraCelula;
    }

    public void setTelaCadastraCelula(TelaNovaCelula telaCadastraCelula) {
        this.telaCadastraCelula = telaCadastraCelula;
    }
}
