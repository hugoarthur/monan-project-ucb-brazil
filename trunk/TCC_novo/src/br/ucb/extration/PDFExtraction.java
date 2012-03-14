
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ucb.extration;

/**
 *
 * @author GUICUNHA
 */

import java.io.File;
import java.io.IOException;
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
			e.printStackTrace();
		}
		return textoExtraido;
	}

	public int getNumeroPaginas(String caminhoArquivo) {
		int numPaginas = 0;
		File doc = new File(caminhoArquivo);
		PDDocument pdDoc;
		try {
			pdDoc = PDDocument.load(doc);
			numPaginas = pdDoc.getNumberOfPages();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return numPaginas;
	}
}
