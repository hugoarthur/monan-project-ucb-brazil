
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ucb.manipulacao.pdf;

/**
 *
 * @author GUICUNHA
 */

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class PDFExtraction {
	public String extrairTexto(String caminhoArquivo) {
		String textoExtraido = null;
		File doc = new File(caminhoArquivo);
		PDDocument pdDoc;
		try {
			pdDoc = PDDocument.load(doc);
			PDFTextStripper stripper = new PDFTextStripper();
			textoExtraido = stripper.getText(pdDoc);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "É preciso selecionar um Arquivo PDF.", "Erro", JOptionPane.ERROR_MESSAGE);
		}
		return textoExtraido;
	}
        public String extrairPDF(String str){        
            String texto = this.extrairTexto(str);        
            return texto;
        }
}