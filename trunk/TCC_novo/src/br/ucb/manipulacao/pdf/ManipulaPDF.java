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
    private String texto;
    private PDFExtraction extrair = new PDFExtraction();
    private FileChooser caminhoPDF = new FileChooser();

    public String extrairPDF() {
        texto = "";
        if (!"".equals(this.caminho)) {
            texto = extrair.extrairPDF(caminho);
        }
        return texto;
    }

    public String caminhoArquivoFileChooser() {
        caminho = caminhoPDF.caminho();
        extrairPDF();
        return texto;
    }

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
