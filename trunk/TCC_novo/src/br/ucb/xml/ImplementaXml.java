/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

    private String caminho = "xml/arq.xml";
    private File arq = new File(caminho);

    public void escreverXML(String usu, String proj, String categ, String text) {

        Element corpos = new Element("corpos");
        Document documento = new Document(corpos);
        List<Element> lista = new ArrayList();

        int cont = 0;
        cont = VerificaArqXML();

        if (cont == 0) {
            lista = Lista();
            for (Element e : lista) {

                Element usuario = new Element("usuario");
                usuario.setAttribute("id", e.getAttributeValue("id"));

                Element projeto = new Element("projeto");
                projeto.setText(e.getChildText("projeto"));

                Element categoria = new Element("categoria");
                categoria.setText(e.getChildText("categoria"));

                Element texto = new Element("texto");
                texto.setText(e.getChildText("texto"));

                usuario.addContent("\n");
                usuario.addContent("\t\t");
                usuario.addContent(projeto);
                usuario.addContent("\n");
                usuario.addContent("\t\t\t");
                usuario.addContent(categoria);
                usuario.addContent("\n");
                usuario.addContent("\t\t\t\t");
                usuario.addContent(texto);
                usuario.addContent("\n");

                corpos.addContent("\n");
                corpos.addContent("\t");
                corpos.addContent(usuario);
                corpos.addContent("\n");

            }

            Element usuario = new Element("usuario");
            usuario.setAttribute("id", usu);

            Element projeto = new Element("projeto");
            projeto.setText(proj);

            Element categoria = new Element("categoria");
            categoria.setText(categ);

            Element texto = new Element("texto");
            texto.setText(text);

            usuario.addContent("\n");
            usuario.addContent("\t\t");
            usuario.addContent(projeto);
            usuario.addContent("\n");
            usuario.addContent("\t\t\t");
            usuario.addContent(categoria);
            usuario.addContent("\n");
            usuario.addContent("\t\t\t\t");
            usuario.addContent(texto);
            usuario.addContent("\n");

            corpos.addContent("\n");
            corpos.addContent("\t");
            corpos.addContent(usuario);
            corpos.addContent("\n");

        } else {

            Element usuario = new Element("usuario");
            usuario.setAttribute("id", usu);

            Element projeto = new Element("projeto");
            projeto.setText(proj);

            Element categoria = new Element("categoria");
            categoria.setText(categ);

            Element texto = new Element("texto");
            texto.setText(text);

            usuario.addContent("\n");
            usuario.addContent("\t\t");
            usuario.addContent(projeto);
            usuario.addContent("\n");
            usuario.addContent("\t\t\t");
            usuario.addContent(categoria);
            usuario.addContent("\n");
            usuario.addContent("\t\t\t\t");
            usuario.addContent(texto);
            usuario.addContent("\n");

            corpos.addContent("\n");
            corpos.addContent("\t");
            corpos.addContent(usuario);
            corpos.addContent("\n");

        }

        gerarXml(documento);

    }

    public static void gerarXml(Document documento) {

        XMLOutputter xout = new XMLOutputter();

        try {

            FileWriter arquivo = new FileWriter(new File("xml/arq.xml"));

            xout.output(documento, arquivo);

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    public List<Element> Lista() {

        List<Element> lista = new ArrayList();
        XmlReader xmlR = new XmlReader();

        lista = xmlR.ListXml();
        return lista;
    }

    public int VerificaArqXML() {

        if (!this.arq.exists()) {
            return 1;
        }
        return 0;
    }
}
