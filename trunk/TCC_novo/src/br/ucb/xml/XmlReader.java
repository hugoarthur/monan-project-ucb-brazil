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

    public List<Element> ListXml(String caminho) {

        Document doc = null;

        SAXBuilder builder = new SAXBuilder();

        try {

            doc = builder.build(caminho);

        } catch (Exception e) {
            
            e.printStackTrace();
            
        }

        Element root = doc.getRootElement();
        
        List<Element> lista = root.getChildren();
        
        return lista;

    }
}
