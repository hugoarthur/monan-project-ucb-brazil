/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.xml;

import br.ucb.service.Sessao;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Osmar jr
 */
public class ImplementaXml {

    private String caminho;

    public void escreverXML(String usu, String proj, String cel, String text, String nomeArquivo) {

        Element corpos = new Element("corpus");
        Document documento = new Document(corpos);
        List<Element> lista = new ArrayList();

        this.caminho = caminhoArqXml();

        if (verificaArqXML()) {
            lista = lista();
            for (Element e : lista) {

                Element usuario = new Element("usuario");
                usuario.setAttribute("id", e.getAttributeValue("id"));

                Element projeto = new Element("projeto");
                projeto.setText(e.getChildText("projeto"));

                Element celula = new Element("celula");
                celula.setText(e.getChildText("celula"));

                Element texto = new Element("texto");
                texto.setText(e.getChildText("texto"));

                Element nomeArq = new Element("dissertacao");
                nomeArq.setText(e.getChildText("dissertacao"));

                usuario.addContent(projeto);
                usuario.addContent(nomeArq);
                usuario.addContent(celula);
                usuario.addContent(texto);
                corpos.addContent(usuario);

            }

            Element usuario = new Element("usuario");
            usuario.setAttribute("id", usu);

            Element projeto = new Element("projeto");
            projeto.setText(proj);

            Element celula = new Element("celula");
            celula.setText(cel);

            Element texto = new Element("texto");
            texto.setText(text);

            Element nomeArq = new Element("dissertacao");
            nomeArq.setText(nomeArquivo);

            usuario.addContent(projeto);
            usuario.addContent(nomeArq);
            usuario.addContent(celula);
            usuario.addContent(texto);
            corpos.addContent(usuario);


        } else {

            Element usuario = new Element("usuario");
            usuario.setAttribute("id", usu);

            Element projeto = new Element("projeto");
            projeto.setText(proj);

            Element celula = new Element("celula");
            celula.setText(cel);

            Element texto = new Element("texto");
            texto.setText(text);

            Element nomeArq = new Element("dissertacao");
            nomeArq.setText(nomeArquivo);

            usuario.addContent(projeto);
            usuario.addContent(nomeArq);
            usuario.addContent(celula);
            usuario.addContent(texto);
            corpos.addContent(usuario);

        }

        gerarXml(documento);

    }

    private void gerarXml(Document documento) {

        XMLOutputter xout = new XMLOutputter();

        try {
            
            Writer out = new BufferedWriter(new OutputStreamWriter(  
                new FileOutputStream(this.caminho), "UTF8"));  
              

            //FileWriter arquivo = new FileWriter(new File(this.caminho));

            xout.output(documento, out);
            
        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    private List<Element> lista() {

        List<Element> lista = new ArrayList();
        XmlReader xmlR = new XmlReader();

        lista = xmlR.ListXml(this.caminho);
        return lista;
    }

    private boolean verificaArqXML() {
        
        File arq = new File(this.caminho);
        
        if (arq.exists()) {
            
            return true;
        }
        
        return false;
    }

    private String caminhoArqXml() {
        
        String caminho = "./xml/" + Sessao.getInstance().getProjeto().getNomeProjeto() + ".xml";
        
        return caminho;
        
    }
}
