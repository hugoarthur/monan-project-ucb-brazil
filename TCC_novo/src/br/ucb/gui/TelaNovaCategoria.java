/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * telaCategorias.java
 *
 * Created on 06/02/2012, 17:30:41
 */

package br.ucb.gui;

/**
 *
 * @author guicunha
 */
public class TelaNovaCategoria extends javax.swing.JFrame {

    /** Creates new form telaCategorias */
    public TelaNovaCategoria() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenuItem14 = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem32 = new javax.swing.JMenuItem();
        jSeparator26 = new javax.swing.JPopupMenu.Separator();
        jMenuItem33 = new javax.swing.JMenuItem();
        jSeparator27 = new javax.swing.JPopupMenu.Separator();
        jMenuItem34 = new javax.swing.JMenuItem();
        jSeparator28 = new javax.swing.JPopupMenu.Separator();
        jMenuItem35 = new javax.swing.JMenuItem();
        jSeparator29 = new javax.swing.JPopupMenu.Separator();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem37 = new javax.swing.JMenuItem();
        jSeparator30 = new javax.swing.JPopupMenu.Separator();
        jMenuItem38 = new javax.swing.JMenuItem();
        jSeparator31 = new javax.swing.JPopupMenu.Separator();
        jMenuItem39 = new javax.swing.JMenuItem();
        jSeparator32 = new javax.swing.JPopupMenu.Separator();
        jMenuItem40 = new javax.swing.JMenuItem();

        setTitle("NOVA CATEGORIA - Sistema de Avaliação Formativa");
        setResizable(false);

        jLabel1.setText("Nome da Categoria:");

        jLabel2.setText("Tipo de Categoria:");

        jTextField1.setText("jTextField1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        jMenu1.setText("Arquivo");

        jMenu8.setText("Novo");

        jMenuItem1.setText("Projeto");
        jMenu8.add(jMenuItem1);

        jMenu1.add(jMenu8);
        jMenu1.add(jSeparator1);

        jMenu9.setText("Abrir");

        jMenuItem2.setText("Itens Selecionados");
        jMenu9.add(jMenuItem2);
        jMenu9.add(jSeparator7);

        jMenuItem3.setText("Pasta de outro usuário");
        jMenu9.add(jMenuItem3);

        jMenu1.add(jMenu9);
        jMenu1.add(jSeparator2);

        jMenuItem4.setText("Salvar Como");
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator3);

        jMenuItem5.setText("Gerenciamento de arquivos de Dados");
        jMenu1.add(jMenuItem5);
        jMenu1.add(jSeparator4);

        jMenuItem6.setText("Visualização de Impressão");
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator5);

        jMenuItem7.setText("Imprimir");
        jMenu1.add(jMenuItem7);
        jMenu1.add(jSeparator6);

        jMenuItem8.setText("Sair");
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Desfazer Excluir");
        jMenu2.add(jMenuItem9);
        jMenu2.add(jSeparator8);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("Recortar");
        jMenu2.add(jMenuItem10);
        jMenu2.add(jSeparator9);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Copiar");
        jMenu2.add(jMenuItem11);
        jMenu2.add(jSeparator10);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("Colar");
        jMenu2.add(jMenuItem12);
        jMenu2.add(jSeparator11);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("Selecionar Tudo");
        jMenu2.add(jMenuItem13);
        jMenu2.add(jSeparator12);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText("Excluir");
        jMenu2.add(jMenuItem14);
        jMenu2.add(jSeparator13);

        jMenu10.setText("Categorizar");

        jMenuItem15.setText("Todas as Categorias");
        jMenu10.add(jMenuItem15);

        jMenu2.add(jMenu10);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Ações");

        jMenuItem32.setText("Acompanhamento");
        jMenu5.add(jMenuItem32);
        jMenu5.add(jSeparator26);

        jMenuItem33.setText("Categorias");
        jMenu5.add(jMenuItem33);
        jMenu5.add(jSeparator27);

        jMenuItem34.setText("Modelo de Fluxo");
        jMenu5.add(jMenuItem34);
        jMenu5.add(jSeparator28);

        jMenuItem35.setText("Enviar via Email");
        jMenu5.add(jMenuItem35);
        jMenu5.add(jSeparator29);

        jMenuItem36.setText("Recuperar Relatório");
        jMenu5.add(jMenuItem36);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Ajuda");

        jMenuItem37.setText("Ajuda do Sistema");
        jMenu6.add(jMenuItem37);
        jMenu6.add(jSeparator30);

        jMenuItem38.setText("Fale Conosco");
        jMenu6.add(jMenuItem38);
        jMenu6.add(jSeparator31);

        jMenuItem39.setText("Reportar Problema");
        jMenu6.add(jMenuItem39);
        jMenu6.add(jSeparator32);

        jMenuItem40.setText("Sobre");
        jMenu6.add(jMenuItem40);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNovaCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator26;
    private javax.swing.JPopupMenu.Separator jSeparator27;
    private javax.swing.JPopupMenu.Separator jSeparator28;
    private javax.swing.JPopupMenu.Separator jSeparator29;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator30;
    private javax.swing.JPopupMenu.Separator jSeparator31;
    private javax.swing.JPopupMenu.Separator jSeparator32;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
