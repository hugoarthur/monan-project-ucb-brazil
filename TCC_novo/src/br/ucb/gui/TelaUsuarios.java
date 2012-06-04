/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaCategorias.java
 *
 * Created on 28/03/2012, 16:47:54
 */
package br.ucb.gui;

import br.ucb.beans.Usuario;
import br.ucb.gui.ActionListeners.ConfiguraCampos;


/**
 *
 * @author GUICUNHA
 */
public class TelaUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form TelaCategorias
     */
    private ConfiguraCampos setar = new ConfiguraCampos();
    private Usuario user;
    public TelaUsuarios() {
        initComponents();
        listCelulas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        alteraUsuario = new javax.swing.JButton();
        excluirUsuario = new javax.swing.JButton();

        setTitle("Usuários - Corpus Generator");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.darkGray));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        alteraUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ucb/img/nova_celula.png"))); // NOI18N
        alteraUsuario.setText("Altera Usuário");
        alteraUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alteraUsuarioActionPerformed(evt);
            }
        });

        excluirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ucb/img/limpar.png"))); // NOI18N
        excluirUsuario.setText("Excluir Usuário");
        excluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 349, Short.MAX_VALUE)
                        .addComponent(alteraUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirUsuario)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluirUsuario)
                    .addComponent(alteraUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-691)/2, (screenSize.height-320)/2, 691, 320);
    }// </editor-fold>//GEN-END:initComponents

    private void alteraUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alteraUsuarioActionPerformed
        // TODO add your handling code here:
        TelaAlteraUsuario alteraUser = new TelaAlteraUsuario();
        alteraUser.setVisible(true);
        
    }//GEN-LAST:event_alteraUsuarioActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt){
        
        int selectedIndex = jList1.getSelectedIndex();
        this.user = (Usuario) jList1.getModel().getElementAt(selectedIndex);
        System.out.println("nome" + this.user.getNome());
        
    }
    
    private void excluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirUsuarioActionPerformed
        // TODO add your handling code here:
        TelaExcluiUsuario excluiUser = new TelaExcluiUsuario();
        excluiUser.setVisible(true);
        
    }//GEN-LAST:event_excluirUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaUsuarios().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alteraUsuario;
    private javax.swing.JButton excluirUsuario;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void listCelulas() {
        jList1.removeAll();
        jList1.setModel(setar.listaUser());
        jList1.repaint();
    }
    public Usuario getUsuario(){
        
       return this.user;
       
    }
}