/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.xml;

import javax.swing.JOptionPane;

/**
 *
 * @author Osmar jr
 */
public class Teste {
    
    public void CriaXML(String texto){
                
        ImplementaXml xml = new ImplementaXml();
        String usuario = "1";
        String projeto = "1";
        String categoria = "1";
        if (!"".equals(texto)){
            xml.escreverXML(usuario, projeto, categoria, texto);
            JOptionPane.showMessageDialog(null, "Salvo no banco de dados e xml gerado com sucesso");
        }
        else
            JOptionPane.showMessageDialog(null, "Nenhum texto foi cadastrado");        
    }
}
