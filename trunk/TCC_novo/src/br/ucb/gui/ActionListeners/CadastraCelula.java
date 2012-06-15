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
    
    public CadastraCelula(TelaNovaCelula form) {
        setTelaCadastraCelula(form);
        insereCelula();
        getTelaCadastraCelula().setVisible(false);
        TelaInicio tela = (TelaInicio) Sessao.getInstance().getTela();
        tela.setCombo();
    }
    
    public void actionPerformed(ActionEvent e) {
        insereCelula();
        //getTelaCadastro().update(null);
    }
    
    public void insereCelula() {
        Celula celula = new Celula();
        celula.setTxt_celula(getTelaCadastraCelula().getTxtField().getText());
        if (!verificaCelula(celula)) {
            if (!"".equals(celula.getTxt_celula())) {
                CelulaDAO.insereCelula(celula);
                telaIni.setCombo();
            }else
                JOptionPane.showMessageDialog(null, "Um ou mais campos obrigatório não foi preenchido");
            
        } else {
            JOptionPane.showMessageDialog(null, "Celula Existente");
        }
    }
    
    private boolean verificaCelula(Celula celula) {
        List<Celula> listaCelula = CelulaDAO.findAll();
        if (listaCelula != null) {
            for (Celula cel : listaCelula) {
                if (cel.getTxt_celula().equalsIgnoreCase(celula.getTxt_celula())) {
                    return true;
                }
            }
            
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
