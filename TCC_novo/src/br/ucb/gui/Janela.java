/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ucb.gui;

/**
 *
 * @author GUICUNHA
 */
import br.ucb.extration.PDFExtraction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Janela extends JFrame {

	private static final long serialVersionUID = -845967882639773609L;
	private JLabel labelCampoArquivo;
	private JTextField campoArquivo;
	private JButton botaoExtrair;
	private JLabel labelCampoTextoExtraido;
	private JTextArea campoTextoExtraido;
	private JScrollPane scrolCampoTextoExtraido;

	public Janela() {
		super.setSize(650, 550);
		super.setLayout(null);
		this.labelCampoArquivo = new JLabel("Arquivo: ");
		this.labelCampoArquivo.setBounds(10, 10, 100, 25);
		add(this.labelCampoArquivo);
		this.campoArquivo = new JTextField();
		this.campoArquivo.setBounds(100, 10, 400, 25);
		add(this.campoArquivo);
		this.botaoExtrair = new JButton("Extrair");
		this.botaoExtrair.setBounds(500, 10, 100, 25);
		add(this.botaoExtrair);
		this.labelCampoTextoExtraido = new JLabel("Texto:");
		this.labelCampoTextoExtraido.setBounds(10, 50, 150, 25);
		add(this.labelCampoTextoExtraido);
		this.campoTextoExtraido = new JTextArea();
		this.scrolCampoTextoExtraido = new JScrollPane(this.campoTextoExtraido);
		add(this.scrolCampoTextoExtraido);
		this.scrolCampoTextoExtraido.setBounds(10, 80, 600, 400);
		this.botaoExtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				botaoExtrairClick(evt);
			}
		});
	}

	private void botaoExtrairClick(java.awt.event.ActionEvent evt) {
	String caminhoArquivo = this.campoArquivo.getText();
	PDFExtraction pdfExtraction = new PDFExtraction();
	this.campoTextoExtraido.setText(pdfExtraction.extrairTexto(caminhoArquivo));
	this.labelCampoTextoExtraido.setText("Texto: " + pdfExtraction.getNumeroPaginas(caminhoArquivo) + "páginas");
	}

}
