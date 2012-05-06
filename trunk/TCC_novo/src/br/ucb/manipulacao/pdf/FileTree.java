/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.manipulacao.pdf;

import java.awt.BorderLayout;
import java.io.File;
import java.util.Collections;
import java.util.Vector;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author GUICUNHA
 */
public class FileTree extends JPanel {
    public JEditorPane jEditorPane;
    
    public FileTree(File dir) {
        setLayout(new BorderLayout());

        // Make a tree list with all the nodes, and make it a JTree
        JTree tree = new JTree(addNodes(null, dir));

        // Add a listener
        tree.addTreeSelectionListener(new TreeSelectionListener() {

            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) e.getPath().getLastPathComponent();
                ////////////////////////////////////////////////////////////////
                //Classe que manipula a extraçao do PDF.
                ManipulaPDF manipulaPDF = new ManipulaPDF();
                //Pega o caminho do Arquivo.
                Object[] caminhoPdf = e.getPath().getPath();
                String caminho = "";
                //Constroi o caminho do arquivo.
                for( Object pdf : caminhoPdf )
                    caminho += pdf+"/";
                //Verifica se o que foi selecionado é um arquivo
                if( new File(caminho).isFile() ) {
                    int opcao = JOptionPane.showConfirmDialog(null,"Deseja abrir esse Arquivo?",null,JOptionPane.YES_NO_OPTION);
                    if(opcao == JOptionPane.YES_OPTION){ 
                        //Add o texto extraido no campo jEditorPane.
                        manipulaPDF.setCaminho(caminho);
                        jEditorPane.setText(manipulaPDF.extrairPDF());
                    }
                }
                ////////////////////////////////////////////////////////////////
            }
        });

        // Lastly, put the JTree into a JScrollPane.
        JScrollPane scrollpane = new JScrollPane();
        scrollpane.getViewport().add(tree);
        add(BorderLayout.CENTER, scrollpane);
    }

    /** Add nodes from under "dir" into curTop. Highly recursive. */
    DefaultMutableTreeNode addNodes(DefaultMutableTreeNode curTop, File dir) {
        String curPath = dir.getPath();
        DefaultMutableTreeNode curDir = new DefaultMutableTreeNode(curPath);
        if (curTop != null) { // should only be null at root
            curTop.add(curDir);
        }
        Vector ol = new Vector();
        String[] tmp = dir.list();
        for (int i = 0; i < tmp.length; i++) {
            ol.addElement(tmp[i]);
        }
        Collections.sort(ol, String.CASE_INSENSITIVE_ORDER);
        File f;
        Vector files = new Vector();
        // Make two passes, one for Dirs and one for Files. This is #1.
        for (int i = 0; i < ol.size(); i++) {
            String thisObject = (String) ol.elementAt(i);
            String newPath;
            if (curPath.equals(".")) {
                newPath = thisObject;
            } else {
                newPath = curPath + File.separator + thisObject;
            }
            if ((f = new File(newPath)).isDirectory()) {
                addNodes(curDir, f);
            } else {
                files.addElement(thisObject);
            }
        }
        // Pass two: for files.
        for (int fnum = 0; fnum < files.size(); fnum++) {
            curDir.add(new DefaultMutableTreeNode(files.elementAt(fnum)));
        }
        return curDir;
    }
}
