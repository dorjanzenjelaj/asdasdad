package com.translateapp.translateapp.frontend;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class LoginView extends javax.swing.JPanel {

    public LoginView(Connection con, JFrame jf) {
        initComponents(con, jf);
    }

    private void initComponents(Connection con, JFrame jf) {
        setVisible(true);

        logoLabel1 = new javax.swing.JLabel();
        logoLabel2 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        emailTextField = new java.awt.TextField();
        emailLabel = new javax.swing.JLabel();
        passwordTextField = new java.awt.TextField();
        passwordLabel = new javax.swing.JLabel();
        loginMessage = new javax.swing.JLabel();
        forgotPasswordButton = new javax.swing.JLabel();
        noAccountLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JLabel();

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
        
        loginButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        loginButton.setLabel("Login");
       
          
        loginButton.setBackground(new java.awt.Color(1, 111, 160)); 
        loginButton.setForeground(new java.awt.Color(255, 255, 255)); 
        loginButton.setBorder(new RoundButton(55));
        loginButton.setOpaque(false);

        emailTextField.setBackground(new java.awt.Color(153, 153, 153));

        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");

        passwordTextField.setBackground(new java.awt.Color(153, 153, 153));

        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");

        loginMessage.setForeground(new java.awt.Color(255, 255, 255));
        loginMessage.setText("Login to your account");

        forgotPasswordButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        forgotPasswordButton.setForeground(new java.awt.Color(1, 111, 160));
        forgotPasswordButton.setText("Forgot Password?");

        noAccountLabel.setForeground(new java.awt.Color(255, 255, 255));
        noAccountLabel.setText("Dont Have Account ?");

        registerButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        registerButton.setForeground(new java.awt.Color(1, 111, 160));
        registerButton.setText("Register");
        
        
        
        forgotPasswordButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("you clicked");
                
                new MainEmail(con, jf);

            }
        });
       
        registerButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("you clicked");
                
                new MainRegisterUser(con, jf);

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
                                .addComponent(passwordLabel)
                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(loginMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(noAccountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registerButton)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(forgotPasswordButton)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoLabel1)
                    .addComponent(logoLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(loginMessage)
                .addGap(62, 62, 62)
                .addComponent(emailLabel)
                .addGap(1, 1, 1)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLabel)
                .addGap(1, 1, 1)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotPasswordButton)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noAccountLabel)
                    .addComponent(registerButton))
                .addGap(179, 179, 179))
        );

        emailLabel.getAccessibleContext().setAccessibleName("");
    }
    
    
    private javax.swing.JLabel emailLabel;
    private java.awt.TextField emailTextField;
    private javax.swing.JLabel forgotPasswordButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginMessage;
    private javax.swing.JLabel logoLabel1;
    private javax.swing.JLabel logoLabel2;
    private javax.swing.JLabel noAccountLabel;
    private javax.swing.JLabel passwordLabel;
    private java.awt.TextField passwordTextField;
    private javax.swing.JLabel registerButton;

}
