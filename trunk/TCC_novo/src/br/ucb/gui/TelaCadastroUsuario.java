/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaCadastro.java
 *
 * Created on 28/03/2012, 14:58:53
 */

package br.ucb.gui;

import br.ucb.gui.cadastro.CadastrarUsuario;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author GUICUNHA
 */
public class TelaCadastroUsuario extends javax.swing.JFrame {

    /** Creates new form TelaCadastro */
    public TelaCadastroUsuario() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        NomeLabel = new javax.swing.JLabel();
        NomeTextField = new javax.swing.JTextField();
        UniversidadeLabel = new javax.swing.JLabel();
        LoginLabel = new javax.swing.JLabel();
        LoginTextField = new javax.swing.JTextField();
        SenhaLabel = new javax.swing.JLabel();
        SenhaPasswordField = new javax.swing.JPasswordField();
        Cadastrar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        universidadeComboBox = new javax.swing.JComboBox();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setTitle("CADASTRO - Sistema de Avaliação Formativa");
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Novo Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.darkGray));

        NomeLabel.setText("Nome : ");

        UniversidadeLabel.setText("Universidade :");

        LoginLabel.setText("Login :");

        SenhaLabel.setText("Senha :");

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ucb/img/logo_ucb.png"))); // NOI18N

        universidadeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, universidadeComboBox, org.jdesktop.beansbinding.ELProperty.create("${instituicao}"), universidadeComboBox, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"), "");
        bindingGroup.addBinding(binding);

        universidadeComboBox.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                universidadeComboBoxComponentAdded(evt);
            }
        });
        universidadeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                universidadeComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NomeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NomeTextField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(UniversidadeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(universidadeComboBox, 0, 165, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Cadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cancelar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SenhaLabel)
                                    .addComponent(LoginLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LoginTextField)
                                    .addComponent(SenhaPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeLabel)
                    .addComponent(NomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(universidadeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UniversidadeLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginLabel)
                    .addComponent(LoginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SenhaLabel)
                    .addComponent(SenhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancelar))
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        getCadastrar().addActionListener(new CadastrarUsuario(this));
    }//GEN-LAST:event_CadastrarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_formComponentAdded

    private void universidadeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_universidadeComboBoxActionPerformed
        // TODO add your handling code here:
        setItemUniverdidade();
    }//GEN-LAST:event_universidadeComboBoxActionPerformed

    private void universidadeComboBoxComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_universidadeComboBoxComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_universidadeComboBoxComponentAdded

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
                String [] instituicao = {"Universidade Federal Fluminense" ,
                "Universidade Católica de Brasília", "Universidade Federal de Santa Catarina"};
//                universidadeCombo = new JComboBox(instituicao);

                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JTextField LoginTextField;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JTextField NomeTextField;
    private javax.swing.JLabel SenhaLabel;
    private javax.swing.JPasswordField SenhaPasswordField;
    private javax.swing.JLabel UniversidadeLabel;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox universidadeComboBox;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public JTextField getLoginTextField() {
        return LoginTextField;
    }

    public void setLoginTextField(JTextField LoginTextField) {
        this.LoginTextField = LoginTextField;
    }

    public JTextField getNomeTextField() {
        return NomeTextField;
    }

    public void setNomeTextField(JTextField NomeTextField) {
        this.NomeTextField = NomeTextField;
    }

    public JPasswordField getSenhaSenhaPasswordField() {
        return getSenhaPasswordField();
    }

    public void setSenhaPasswordField(JPasswordField senhaPasswordField) {
        this.SenhaPasswordField = senhaPasswordField;
    }

    /**
     * @return the Cadastrar
     */
    public javax.swing.JButton getCadastrar() {
        return Cadastrar;
    }

    /**
     * @param Cadastrar the Cadastrar to set
     */
    public void setCadastrar(javax.swing.JButton Cadastrar) {
        this.Cadastrar = Cadastrar;
    }

    /**
     * @return the Cancelar
     */
    public javax.swing.JButton getCancelar() {
        return Cancelar;
    }

    /**
     * @param Cancelar the Cancelar to set
     */
    public void setCancelar(javax.swing.JButton Cancelar) {
        this.Cancelar = Cancelar;
    }

    /**
     * @return the LoginLabel
     */
    public javax.swing.JLabel getLoginLabel() {
        return LoginLabel;
    }

    /**
     * @param LoginLabel the LoginLabel to set
     */
    public void setLoginLabel(javax.swing.JLabel LoginLabel) {
        this.LoginLabel = LoginLabel;
    }

    /**
     * @return the NomeLabel
     */
    public javax.swing.JLabel getNomeLabel() {
        return NomeLabel;
    }

    /**
     * @param NomeLabel the NomeLabel to set
     */
    public void setNomeLabel(javax.swing.JLabel NomeLabel) {
        this.NomeLabel = NomeLabel;
    }

    /**
     * @return the SenhaLabel
     */
    public javax.swing.JLabel getSenhaLabel() {
        return SenhaLabel;
    }

    /**
     * @param SenhaLabel the SenhaLabel to set
     */
    public void setSenhaLabel(javax.swing.JLabel SenhaLabel) {
        this.SenhaLabel = SenhaLabel;
    }

    /**
     * @return the SenhaPasswordField
     */
    public javax.swing.JPasswordField getSenhaPasswordField() {
        return SenhaPasswordField;
    }

    /**
     * @return the UniversidadeLabel
     */
    public javax.swing.JLabel getUniversidadeLabel() {
        return UniversidadeLabel;
    }

    /**
     * @param UniversidadeLabel the UniversidadeLabel to set
     */
    public void setUniversidadeLabel(javax.swing.JLabel UniversidadeLabel) {
        this.UniversidadeLabel = UniversidadeLabel;
    }

    /**
     * @return the jLabel5
     */
    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    /**
     * @param jLabel5 the jLabel5 to set
     */
    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * @param jPanel1 the jPanel1 to set
     */
    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    /**
     * @return the jPanel2
     */
    public javax.swing.JPanel getjPanel2() {
        return jPanel2;
    }

    /**
     * @param jPanel2 the jPanel2 to set
     */
    public void setjPanel2(javax.swing.JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    /**
     * @return the universidadeComboBox
     */
    public javax.swing.JComboBox getUniversidadeComboBox() {
        return universidadeComboBox;
    }

    /**
     * @param universidadeComboBox the universidadeComboBox to set
     */
    public void setUniversidadeComboBox(javax.swing.JComboBox universidadeComboBox) {
        this.universidadeComboBox = universidadeComboBox;
    }

    private void setItemUniverdidade(){
        universidadeComboBox.removeAllItems();
        universidadeComboBox.addItem("Universidade Católica de Brasília");
        universidadeComboBox.addItem("Universidade Federal Fluminense");
        universidadeComboBox.addItem("Universidade Federal de Santa Catarina");
    }

    

}
