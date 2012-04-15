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
    public static void main(String[] args) {
        ImplementaXML xml = new ImplementaXML();
        String usuario = "1";
        String projeto = "1";
        String categoria = "1";
        String texto = "olá enfermeira";
        xml.escreverXML(usuario, projeto, categoria, texto);
    }
}
