/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui.ActionListeners;

import br.ucb.gui.TelaAcompanhamento;
import javax.swing.JTable;

/**
 *
 * @author guilherme
 */

public class ConfiguraJtable  {
    
    private TelaAcompanhamento telaAcomp;
    
    String coluna[] = {"Coluna1","Coluna2","Coluna3","coluna4"};
    String linha[][] = {{"11","12","13"}, {"21","22", "23"}, {"31","32","33"},{"41","42","43"}};
    
    JTable jtable = new JTable(linha, coluna);
    
    public void configuraJtable(){
                
        telaAcomp.setJTable(jtable);
    }
    
   
}
