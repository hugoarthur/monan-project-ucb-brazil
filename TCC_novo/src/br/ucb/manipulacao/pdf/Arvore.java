/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ucb.manipulacao.pdf;

/**
 *
 * @author GUICUNHA
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import br.ucb.gui.TelaInicio;
import java.io.File;

public class Arvore extends JInternalFrame implements ActionListener {

   private JTextField    campo;
   private JButton      botao;
   private JPanel      painelCima;
   private JPanel      painelBaixo;
   private JTree      arvore;

   public Arvore() {
      Arvore frame = new Arvore();
      //super("Browser");
      TelaInicio tela = new TelaInicio();
      //getContentPane().setLayout(new BorderLayout());
      TelaInicio telainicio = new TelaInicio();
      campo      = new JTextField();
      botao      = new JButton("Procurar");
      painelCima   = new JPanel(new BorderLayout());
      painelBaixo   = new JPanel(new GridLayout(1,1));
      arvore      = new JTree();
      telainicio.add(campo ,BorderLayout.CENTER );
      telainicio.add(botao ,BorderLayout.EAST );
      botao.addActionListener(this);
      campo.addActionListener(this);
      painelCima.add(campo, BorderLayout.CENTER);
      painelCima.add(botao, BorderLayout.EAST);
      telainicio.add(frame);
      tela.setVisible(true);
      frame.setVisible(true);

      

      //getContentPane().add(painelCima,  BorderLayout.NORTH);
      //getContentPane().add(painelBaixo, BorderLayout.CENTER);

      //this.setSize(250,350);
      //this.setVisible(true);
      //this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
   }

   public void actionPerformed(ActionEvent e) {
      
      FileChooser files = new FileChooser();
      String caminho = files.caminho();
      DefaultMutableTreeNode pai = new DefaultMutableTreeNode(caminho);
      varre(caminho, pai);
      arvore = new JTree(pai);
      painelBaixo.removeAll();
      painelBaixo.add(new JScrollPane(arvore));
      getContentPane().validate();
      
   }

   public void varre(String base, DefaultMutableTreeNode no) {

      File diretorio = new File(base);
      File[] conteudo = diretorio.listFiles();

      for (int i=0; i < conteudo.length; i++) {

         if (conteudo[i].isFile()) {
            DefaultMutableTreeNode arquivo = new DefaultMutableTreeNode(conteudo[i].getName());
            no.add(arquivo);
         }
         else {
            DefaultMutableTreeNode dir = new DefaultMutableTreeNode(conteudo[i].getName());
            varre(conteudo[i].toString(), dir);
            no.add(dir);
         }
      }
   }   
}