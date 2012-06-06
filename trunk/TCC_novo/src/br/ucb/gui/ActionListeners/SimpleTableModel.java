/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui.ActionListeners;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Osmar jr
 */
public class SimpleTableModel extends AbstractTableModel {
    
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    public SimpleTableModel(ArrayList dados, String[] colunas) {
        
        setLinhas(dados);
        setColunas(colunas);
        
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        String[] linha = (String[]) getLinhas().get(rowIndex);
        return linha[columnIndex];
        
    }
    
    public String[] getColunas() {
        return colunas;
    }
    
    public ArrayList getLinhas() {
        return linhas;
    }
    
    public void setColunas(String[] strings) {
        colunas = strings;
    }
    
    public void setLinhas(ArrayList list) {
        linhas = list;
    }
    
    public int getColumnCount() {
        return getColunas().length;
    }
    
    public int getRowCount() {
        return getLinhas().size();
    }

    public String getColumnName(int col) {
        
        return getColunas()[col];
        
    }
}
