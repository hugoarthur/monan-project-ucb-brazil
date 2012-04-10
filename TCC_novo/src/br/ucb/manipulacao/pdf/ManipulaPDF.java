/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.manipulacao.pdf;

/**
 *
 * @author Osmar jr
 */
public class ManipulaPDF {
    
    PDFExtraction extrair = new PDFExtraction();
    FileChooser caminhoPDF = new FileChooser();
    
    public String extrairPDF(){
        String texto = "";
        String caminho = this.caminhoArquivo();
        if (caminho != ""){
            texto = extrair.extrairPDF(caminho);
        }
        return texto;        
    }
    public String caminhoArquivo (){
        String caminho = caminhoPDF.caminho();
        return caminho;
    }
}
