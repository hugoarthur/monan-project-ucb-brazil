/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.xml;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;
/**
 *
 * @author Osmar jr
 */
public class ImplementaXML {
    
    private Element root = new Element ("root");
    private Document documento = new Document (root);
    
    private Element usuario = new Element ("usuario");
    private Element projeto = new Element ("projeto");
    private Element categoria = new Element ("categoria");
    private Element texto = new Element ("texto");
    
    public void escreverXML(String usuario,String projeto,String categoria,
            String texto){
        this.usuario.setAttribute("id",usuario);
        this.projeto.setAttribute("id",projeto);
        this.categoria.setAttribute("id",categoria);
        this.texto.setText(texto);
        
        adicionarElementos();
    }
    
    public void adicionarElementos(){
        this.categoria.addContent(this.texto);
        this.projeto.addContent(this.categoria);
        this.usuario.addContent(this.projeto);
        this.root.addContent(this.usuario);
        
        gerarXML();
    }
    public void gerarXML(){
        XMLOutputter xout = new XMLOutputter();
        try {
            FileWriter arquivo = new FileWriter(new File("xml/arquivo"+this.usuario.getAttributeValue("id")+".xml"));
            xout.output(this.documento, arquivo);
        } catch (IOException e) {
            
        }
   }
}
