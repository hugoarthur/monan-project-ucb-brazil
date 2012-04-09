/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.manipulacao.pdf;

import br.ucb.extration.PDFExtraction;
import br.ucb.extration.directory.FileChooser;

/**
 *
 * @author Osmar jr
 */
public class ManipulaPDF {
    
    PDFExtraction extrair = new PDFExtraction();
    FileChooser caminhoPDF = new FileChooser();
    
    public String extrairPDF(){
        
        String caminho = this.caminhoArquivo();
        String texto = extrair.extrairPDF(caminho);
        return texto;
        
    }
    public String caminhoArquivo (){
        String caminho = caminhoPDF.caminho();
        return caminho;
    }
}
