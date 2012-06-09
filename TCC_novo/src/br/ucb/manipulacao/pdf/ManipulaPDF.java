/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.manipulacao.pdf;

import br.ucb.service.Sessao;

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
        this.texto = "";
        if (!"".equals(this.caminho)) {
            this.texto = extrair.extrairPDF(this.caminho);
        }
        return texto;
    }

    public String caminhoArquivoFileChooser() {
        this.caminho = caminhoPDF.caminho();
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
