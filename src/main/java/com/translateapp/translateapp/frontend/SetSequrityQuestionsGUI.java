/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.translateapp.translateapp.frontend;

/**
 *
 * @author dorjanzenjelaj
 */
public class SetSequrityQuestionsGUI extends javax.swing.JPanel {

    /**
     * Creates new form loginInterface
     */
    public SetSequrityQuestionsGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoLabel1 = new javax.swing.JLabel();
        logoLabel2 = new javax.swing.JLabel();
        registerButton = new java.awt.Button();
        securityAnswer1 = new java.awt.TextField();
        securityAnswerLabel1 = new javax.swing.JLabel();
        securityAnswer2 = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        securityQuestionLabel1 = new javax.swing.JLabel();
        securityAnswerLabel3 = new javax.swing.JLabel();
        securityQuestionLabel2 = new javax.swing.JLabel();
        securityQuestion3 = new javax.swing.JComboBox<>();
        securityAnswer3 = new java.awt.TextField();
        securityAnswerLabel2 = new javax.swing.JLabel();
        securityQuestion1 = new javax.swing.JComboBox<>();
        securityQuestionLabel3 = new javax.swing.JLabel();
        securityQuestion2 = new javax.swing.JComboBox<>();
        backButton = new java.awt.Button();
        messageLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setForeground(new java.awt.Color(51, 51, 51));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(335, 769));

        logoLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        logoLabel1.setForeground(new java.awt.Color(255, 255, 255));
        logoLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        logoLabel1.setText("Lang");
        logoLabel1.setIconTextGap(0);

        logoLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        logoLabel2.setForeground(new java.awt.Color(1, 111, 160));
        logoLabel2.setText("Learner");
        logoLabel2.setIconTextGap(0);

        registerButton.setBackground(new java.awt.Color(1, 111, 160));
        registerButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setLabel("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        securityAnswer1.setBackground(new java.awt.Color(153, 153, 153));
        securityAnswer1.setBounds(new java.awt.Rectangle(10, 10, 10, 10));
        securityAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityAnswer1ActionPerformed(evt);
            }
        });

        securityAnswerLabel1.setForeground(new java.awt.Color(255, 255, 255));
        securityAnswerLabel1.setText("Enter Answer 1");

        securityAnswer2.setBackground(new java.awt.Color(153, 153, 153));
        securityAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityAnswer2ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        securityQuestionLabel1.setForeground(new java.awt.Color(255, 255, 255));
        securityQuestionLabel1.setText("Security Question 1");

        securityAnswerLabel3.setForeground(new java.awt.Color(255, 255, 255));
        securityAnswerLabel3.setText("Enter answer 3");

        securityQuestionLabel2.setForeground(new java.awt.Color(255, 255, 255));
        securityQuestionLabel2.setText("Security Question 2");

        securityQuestion3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        securityQuestion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityQuestion3ActionPerformed(evt);
            }
        });

        securityAnswer3.setBackground(new java.awt.Color(153, 153, 153));
        securityAnswer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityAnswer3ActionPerformed(evt);
            }
        });

        securityAnswerLabel2.setForeground(new java.awt.Color(255, 255, 255));
        securityAnswerLabel2.setText("Enter answer 3");

        securityQuestion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        securityQuestion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityQuestion1ActionPerformed(evt);
            }
        });

        securityQuestionLabel3.setForeground(new java.awt.Color(255, 255, 255));
        securityQuestionLabel3.setText("Security Question 3");

        securityQuestion2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        securityQuestion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityQuestion2ActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(1, 111, 160));
        backButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setLabel("<-");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        messageLabel.setForeground(new java.awt.Color(255, 255, 255));
        messageLabel.setText("Please fill all the fields");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(messageLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(securityQuestion3, 0, 232, Short.MAX_VALUE)
                                    .addComponent(securityAnswer3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(registerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(securityQuestionLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(logoLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(logoLabel2))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(securityQuestion2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(securityAnswer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(securityQuestionLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(securityAnswerLabel2))
                                            .addComponent(securityQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 1, Short.MAX_VALUE))
                                    .addComponent(securityAnswer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(22, 22, 22)))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(securityAnswerLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(securityQuestionLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(securityAnswerLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoLabel1)
                    .addComponent(logoLabel2))
                .addGap(67, 67, 67)
                .addComponent(securityQuestionLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(securityQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(securityAnswerLabel1)
                .addGap(2, 2, 2)
                .addComponent(securityAnswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(securityQuestionLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(securityQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(securityAnswerLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(312, 312, 312))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(securityAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(securityQuestionLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(securityQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(securityAnswerLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(securityAnswer3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(messageLabel)
                        .addGap(28, 28, 28)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        securityAnswerLabel1.getAccessibleContext().setAccessibleName("");
        securityQuestionLabel1.getAccessibleContext().setAccessibleName("Create new account");
    }// </editor-fold>//GEN-END:initComponents

    private void securityAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityAnswer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_securityAnswer1ActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed

    private void securityAnswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityAnswer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_securityAnswer2ActionPerformed

    private void securityQuestion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityQuestion3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_securityQuestion3ActionPerformed

    private void securityAnswer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityAnswer3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_securityAnswer3ActionPerformed

    private void securityQuestion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityQuestion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_securityQuestion1ActionPerformed

    private void securityQuestion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityQuestion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_securityQuestion2ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button backButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel logoLabel1;
    private javax.swing.JLabel logoLabel2;
    private javax.swing.JLabel messageLabel;
    private java.awt.Button registerButton;
    private java.awt.TextField securityAnswer1;
    private java.awt.TextField securityAnswer2;
    private java.awt.TextField securityAnswer3;
    private javax.swing.JLabel securityAnswerLabel1;
    private javax.swing.JLabel securityAnswerLabel2;
    private javax.swing.JLabel securityAnswerLabel3;
    private javax.swing.JComboBox<String> securityQuestion1;
    private javax.swing.JComboBox<String> securityQuestion2;
    private javax.swing.JComboBox<String> securityQuestion3;
    private javax.swing.JLabel securityQuestionLabel1;
    private javax.swing.JLabel securityQuestionLabel2;
    private javax.swing.JLabel securityQuestionLabel3;
    // End of variables declaration//GEN-END:variables
}