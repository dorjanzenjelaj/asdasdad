package com.translateapp.translateapp.frontend;

import com.translateapp.translateapp.usecase.EmailValidationUseCase;
import com.translateapp.translateapp.usecase.RegisterUserUseCase;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import javax.swing.JFrame;


public class RegisterView extends javax.swing.JPanel {

    public RegisterView(Connection con, JFrame jf) {
        initComponents(con, jf);
    }

    private void initComponents(Connection con, JFrame jf) {
        setVisible(true);

        logoLabel1 = new javax.swing.JLabel();
        logoLabel2 = new javax.swing.JLabel();
        continueButton = new java.awt.Button();
        fullNameTextField = new java.awt.TextField();
        fullNameLabel = new javax.swing.JLabel();
        emailTextField = new java.awt.TextField();
        messageLabel = new javax.swing.JLabel();
        noAccountLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        emailLabel = new javax.swing.JLabel();
        backButton = new java.awt.Button();
        roleSelection = new javax.swing.JCheckBox();

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

        continueButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        continueButton.setLabel("Continue");
        
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                String name = fullNameTextField.getText();
                String surname = "";
                
                String fullName = fullNameTextField.getText();
                if(fullName.contains(" ")) {
                    
                    name = fullName.substring(0, fullName.indexOf(' '));
                    surname = fullName.substring(name.length() + 1, fullName.length());
                
                }
                
                
                String email = emailTextField.getText();
                String password = passwordTextField.getText();
                int role = 1;
                if (roleSelection.isSelected()) {
                    role = 2;
                }
                
                if(!email.equals("") && !password.equals("") && !name.equals("")) continueButtonActionPerformed(evt, con, jf, name, surname, email, password, role);
                else messageLabel.setText("Fill Name, email and password!");
            }

        });

        fullNameTextField.setBackground(new java.awt.Color(153, 153, 153));
        fullNameTextField.setBounds(new java.awt.Rectangle(10, 10, 10, 10));

        fullNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        fullNameLabel.setText("Full Name");

        emailTextField.setBackground(new java.awt.Color(153, 153, 153));

        messageLabel.setForeground(new java.awt.Color(255, 255, 255));
        messageLabel.setText("Create your account");

        noAccountLabel.setForeground(new java.awt.Color(255, 255, 255));
        noAccountLabel.setText("Already have an account? ");

        LoginButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(1, 111, 160));
        LoginButton.setText("Login");
        
        LoginButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
           
                new Main(con, jf);

            }
        });

        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");

        passwordTextField.setBackground(new java.awt.Color(204, 204, 204));

        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");

        backButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        backButton.setLabel("<-");
        
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
              new Main(con, jf);

        }});

        roleSelection.setForeground(new java.awt.Color(255, 255, 255));
        roleSelection.setText("Confirm Tescher Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(logoLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoLabel2)
                .addGap(0, 92, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(passwordTextField)
                                        .addGap(42, 42, 42))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(fullNameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                            .addComponent(emailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                              )
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordLabel)
                                    .addComponent(emailLabel)
                                    .addComponent(fullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roleSelection))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(noAccountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LoginButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                .addGap(91, 91, 91)
                .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(fullNameLabel)
                .addGap(1, 1, 1)
                .addComponent(fullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel)
                .addGap(1, 1, 1)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
  
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(roleSelection)
                .addGap(24, 24, 24)
                .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noAccountLabel)
                    .addComponent(LoginButton))
                .addGap(119, 119, 119))
        );

        fullNameLabel.getAccessibleContext().setAccessibleName("");
        messageLabel.getAccessibleContext().setAccessibleName("Create new account");
        
    }                      

    private void continueButtonActionPerformed(ActionEvent evt, Connection con, JFrame jf, String name, String surname, String email, String password, int role) {
        new MainSetSecQuest(con, jf, name, surname, email, password, role);
    }

    
    private javax.swing.JLabel LoginButton;
    private java.awt.Button backButton;
    private java.awt.Button continueButton;
    private javax.swing.JLabel emailLabel;
    private java.awt.TextField emailTextField;
    private javax.swing.JLabel fullNameLabel;
    private java.awt.TextField fullNameTextField;
    private javax.swing.JLabel logoLabel1;
    private javax.swing.JLabel logoLabel2;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel noAccountLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JCheckBox roleSelection;
    
    

}
