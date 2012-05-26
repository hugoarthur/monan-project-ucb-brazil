/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.manipulacao.pdf;

import br.ucb.gui.TelaInicio;
import java.io.File;
import javax.swing.BoxLayout;
import javax.swing.JTree;

/**
 *
 * @author GUICUNHA
 */
public class Arvore {

    private JTree jTree1 = new JTree();
    private TelaInicio frame;
    private String wayy[] = {};

    public Arvore(TelaInicio frame) {
        this.frame = frame;
        jTree1 = frame.getJTree1();
        criaArvoreUm();
    }

    public void criaArvoreUm() {

        FileTree fileTree1 = new FileTree(new File("./ArquivosPDF"));
        fileTree1.jEditorPane = this.frame.getJEditorPane();
        jTree1.add(fileTree1);
        jTree1.setLayout(new BoxLayout(jTree1, BoxLayout.X_AXIS));
        for (int i = 0; i < wayy.length; i++) {
            jTree1.add(new FileTree(new File(wayy[i])));
        }
    }
    public void criaArvore(){
        
        
        
    }
}
