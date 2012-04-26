/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui.cadastro;

import br.ucb.beans.Celula;
import br.ucb.dao.UsuarioDAO;
import br.ucb.gui.TelaNovaCelula;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author uc08067807
 */
public class CadastraCelula implements ActionListener{
    
    private TelaNovaCelula telaCadastraCelula;

    public CadastraCelula(TelaNovaCelula form) {
        setTelaCadastraCelula(form);
        insereCelula();
        getTelaCadastraCelula().setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
        insereCelula();
        //getTelaCadastro().update(null);
    }

    public void insereCelula(){
        
    }
    
    public TelaNovaCelula getTelaCadastraCelula() {
        return telaCadastraCelula;
    }

    public void setTelaCadastraCelula(TelaNovaCelula telaCadastraCelula) {
        this.telaCadastraCelula = telaCadastraCelula;
    }
}
