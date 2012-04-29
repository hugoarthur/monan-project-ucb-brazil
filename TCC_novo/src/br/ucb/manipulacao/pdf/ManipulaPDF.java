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
    private String caminho;

    PDFExtraction extrair = new PDFExtraction();
    private FileChooser caminhoPDF = new FileChooser();
    
    public String extrairPDF(){
        String texto = "";
        if (!"".equals(this.caminho)){
            texto = extrair.extrairPDF(caminho);
        }
        return texto;        
    }
//    public static String caminhoArquivo (String str){
//        String caminho = str;
//        return caminho;
//    }

    /**
     * @return the caminho
     */
    public String getCaminho() {
        return caminho;
    }

    /**
     * @param caminho the caminho to set
     */
    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }
}
