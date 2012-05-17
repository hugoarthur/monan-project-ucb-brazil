/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui.cadastro;

import br.ucb.beans.Celula;
import br.ucb.dao.CelulaDAO;
import br.ucb.gui.TelaInicio;
import br.ucb.gui.TelaNovaCelula;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author uc08067807
 */
public class CadastraCelula implements ActionListener {

    private TelaNovaCelula telaCadastraCelula;
    private TelaInicio telaIni = new TelaInicio();
    
    public CadastraCelula(TelaNovaCelula form) {
        setTelaCadastraCelula(form);
        insereCelula();
        getTelaCadastraCelula().setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
        insereCelula();
        //getTelaCadastro().update(null);
    }

    public void insereCelula() {

        Celula celula = new Celula();
        celula.setTxt_celula(getTelaCadastraCelula().getTxtField().getText());
//        String str = getTelaCadastraCelula().getTxtField().getText();
//        telaIni.setJComboBox(str);
        CelulaDAO.insereCelula(celula);
        telaIni.setCombo();
    }

    public TelaNovaCelula getTelaCadastraCelula() {
        return telaCadastraCelula;
    }

    public void setTelaCadastraCelula(TelaNovaCelula telaCadastraCelula) {
        this.telaCadastraCelula = telaCadastraCelula;
    }
}
