
package com.translateapp.translateapp.frontend;

import com.translateapp.translateapp.usecase.EmailValidationUseCase;
import java.sql.Connection;
import javax.swing.JFrame;

public class EmailView extends javax.swing.JPanel {

    public EmailView(Connection con, JFrame jf) {
        initComponents(con, jf);
    }

    private void initComponents(Connection con, JFrame jf) {
        setVisible(true);
        
        logoLabel1 = new javax.swing.JLabel();
        logoLabel2 = new javax.swing.JLabel();
        validateEmailButton = new java.awt.Button();
        emailTextField = new java.awt.TextField();
        emailLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        backButton = new java.awt.Button();

        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(51, 51, 51));
        setToolTipText("");

        logoLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        logoLabel1.setForeground(new java.awt.Color(255, 255, 255));
        logoLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        logoLabel1.setText("Lang");
        logoLabel1.setIconTextGap(0);

        logoLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        logoLabel2.setForeground(new java.awt.Color(1, 111, 160));
        logoLabel2.setText("Learner");
        logoLabel2.setIconTextGap(0);

       
        validateEmailButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        validateEmailButton.setLabel("Validate");

        emailTextField.setBackground(new java.awt.Color(153, 153, 153));

        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");

        messageLabel.setForeground(new java.awt.Color(255, 255, 255));
        messageLabel.setText("Please provide a valid email");

        
        backButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        backButton.setLabel("<-");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new Main(con, jf);
            }
        });
        
        
        validateEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String emailText = emailTextField.getText();
                validateEmailDB(evt, con, emailText, jf);
            }
        });
                

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addComponent(logoLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(logoLabel2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(validateEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(messageLabel)
                .addGap(49, 49, 49)
                .addComponent(emailLabel)
                .addGap(1, 1, 1)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(validateEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(308, 308, 308))
        );

        emailLabel.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>                                                              

    private void validateEmailDB(java.awt.event.ActionEvent evt, Connection con, String em, JFrame jf) {
        
        if (em.equals("")) {
            messageLabel.setText("Email field cant be null");
        } else {
            EmailValidationUseCase email = new EmailValidationUseCase();
            System.out.println(email.validateMail(em, con));

            if (email.validateMail(em, con)) {
                new MainSecurityAnswers(con, em, jf);
            } else {
                messageLabel.setText("User not found");
            }
        }

       
    }
    
        // Variables declaration - do not modify                     
    private java.awt.Button backButton;
    private javax.swing.JLabel emailLabel;
    private java.awt.TextField emailTextField;
    private javax.swing.JLabel logoLabel1;
    private javax.swing.JLabel logoLabel2;
    private javax.swing.JLabel messageLabel;
    private java.awt.Button validateEmailButton;
    // End of variables declaration           
                 

}
