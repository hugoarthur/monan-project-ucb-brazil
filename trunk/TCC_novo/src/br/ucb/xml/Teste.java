/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.xml;

/**
 *
 * @author Osmar jr
 */
public class Teste {
    
    public void CriaXML(){
        
        ImplementaXml xml = new ImplementaXml();
        String usuario = "1";
        String projeto = "1";
        String categoria = "1";
        String texto = "olá enfermeira";
        xml.escreverXML(usuario, projeto, categoria, texto);
        
    }
}
