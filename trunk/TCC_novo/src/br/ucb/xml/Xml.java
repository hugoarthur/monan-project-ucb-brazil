/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.xml;

import org.jdom2.Document;
import org.jdom2.Element;

/**
 *
 * @author Osmar jr
 */
public class Xml {
    
    Element root = new Element ("root");
    Document documento = new Document (root);
    
    Element usuario = new Element ("usuario");
    Element projeto = new Element ("projeto");
    Element categoria = new Element ("categoria");
    Element texto = new Element ("texto");
    
}
