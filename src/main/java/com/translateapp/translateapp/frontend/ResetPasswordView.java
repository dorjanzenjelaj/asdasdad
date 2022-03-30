package com.translateapp.translateapp.frontend;

import com.translateapp.translateapp.usecase.ResetPasswordUseCase;
import java.sql.Connection;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class ResetPasswordView extends javax.swing.JPanel {

    public ResetPasswordView(Connection con, String email, JFrame jf) {
        initComponents(con, email, jf);
    }

    private void initComponents(Connection con, String em, JFrame jf) {
        setVisible(true);
      
        
        logoLabel1 = new javax.swing.JLabel();
        logoLabel2 = new javax.swing.JLabel();
        backButton = new java.awt.Button();
        newPasswordLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPasswordTextField = new javax.swing.JPasswordField();
        newPasswordTextField = new javax.swing.JPasswordField();
        resetPasswordButton = new java.awt.Button();

        setBackground(new java.awt.Color(51, 51, 51));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        backButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        backButton.setLabel("<-");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new MainEmail(con, jf);
            }
        });

        newPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        newPasswordLabel.setText("Password");

        messageLabel.setForeground(new java.awt.Color(255, 255, 255));
        messageLabel.setText("Enter new password");

        confirmPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        confirmPasswordLabel.setText("New password");

        confirmPasswordTextField.setBackground(new java.awt.Color(204, 204, 204));
        newPasswordTextField.setBackground(new java.awt.Color(204, 204, 204));

        resetPasswordButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        resetPasswordButton.setLabel("Reset password");
        
        resetPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String passwordText = newPasswordTextField.getText();
                String password2Text = confirmPasswordTextField.getText();
                
                if(!passwordText.equals("") && !password2Text.equals("")) {
                    
                    if (!passwordText.equals(password2Text)) {
                        messageLabel.setText("No match!");
                    } else {
                        try {
                            resetPasswordActionPerformed(evt, con, em, passwordText, jf);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ResetPasswordView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else messageLabel.setText("Passwords cant be null");
                
            }
        });


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(logoLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoLabel2)
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmPasswordLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(277, 277, 277)
                            )
                            .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    )
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(46, 46, 46)
                        .addComponent(newPasswordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmPasswordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(60, 60, 60)
                .addComponent(resetPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );


        newPasswordLabel.getAccessibleContext().setAccessibleName("");
        messageLabel.getAccessibleContext().setAccessibleName("Create new account");
        
        
    }                   

    private void resetPasswordActionPerformed(java.awt.event.ActionEvent evt, Connection con, String email, String password, JFrame jf) throws InterruptedException {
        ResetPasswordUseCase resetPasswordUseCase = new ResetPasswordUseCase();
        Boolean result = resetPasswordUseCase.updatePassword(email, con, password);
        if (result) {
            messageLabel.setText("Password was reset successfully!");
        } else {
            messageLabel.setText("Password Cant be changed!");
        }

        int timeout_ms = 1000;//3 * 1000
        Timer timer = new Timer();
        timer.schedule(new CloseDialogTask(jf, con), timeout_ms);

    }

    class CloseDialogTask extends TimerTask {

        JFrame jf;
        Connection con;

        public CloseDialogTask(JFrame jf, Connection con) {
            this.jf = jf;
            this.con = con;
        }

        @Override
        public void run() {
            this.jf.dispose();
            new Main(this.con);
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }
                    
    private java.awt.Button backButton;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPasswordField confirmPasswordTextField;
    private javax.swing.JLabel logoLabel1;
    private javax.swing.JLabel logoLabel2;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JPasswordField newPasswordTextField;
    private java.awt.Button resetPasswordButton;

}
