/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui;

import br.ucb.gui.ActionListeners.SimpleTableModel;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Osmar jr
 */
public class JanelaTeste extends JFrame {
    
    private JScrollPane scrolCampo;
    private JTable tabela;
    
    public JanelaTeste() {
        
        super.setSize(700, 300);
        super.setLayout(null);
        
        setaTable();
        this.tabela.setSize(700, 300);
        this.tabela.setFillsViewportHeight(true);
        
        this.scrolCampo = new JScrollPane(this.tabela);
        
        super.add(this.scrolCampo);
        super.add(this.tabela);
        
    }
    
    public void setaTable() {
        
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"coluna1", "coluna2", "coluna3", "coluna4"};
        
        dados.add(new String[]{"linha 1-1", "linha 1-2", "linha 1-3", "linha 1-4"});
        dados.add(new String[]{"linha 2-1", "linha 2-2", "linha 2-3", "linha 2-4"});
        
        SimpleTableModel modelo = new SimpleTableModel(dados, colunas);
        this.tabela = new JTable(modelo);
        
    }
}
