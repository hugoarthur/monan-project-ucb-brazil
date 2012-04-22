/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.xml;

import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Osmar jr
 */
public class XmlReader {
    
    private Document doc = null;
    
    public List<Element> ListXml(){
        
        XmlR();
        Element root = this.doc.getRootElement();
        List<Element> lista = root.getChildren();
        return lista;
        
    }
    public void XmlR(){

            SAXBuilder builder = new SAXBuilder();

            try {

                  this.doc = builder.build("xml/arquivo.xml");

            } catch (Exception e) {                
            }
            
    }
}
