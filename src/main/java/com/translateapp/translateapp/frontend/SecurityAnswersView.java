package com.translateapp.translateapp.frontend;

import com.translateapp.translateapp.usecase.SecurityAnswersUseCase;
import com.translateapp.translateapp.usecase.SecurityQuestionsUseCase;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;

public class SecurityAnswersView extends javax.swing.JPanel {

    public SecurityAnswersView(Connection con, String email, JFrame jf) {
        initComponents(con, email, jf);
    }

    private void initComponents(Connection con, String email, JFrame jf) {

        SecurityQuestionsUseCase securityQuestionsUseCase = new SecurityQuestionsUseCase();
        Map<Integer, String> questionMap = securityQuestionsUseCase.getASecurityQuestions(email, con);

        setVisible(true);

        logoLabe1 = new javax.swing.JLabel();
        logoLabel2 = new javax.swing.JLabel();
        sendButton = new java.awt.Button();
        securityAnswer1 = new java.awt.TextField();
        answerLabel1 = new javax.swing.JLabel();
        securityQuestion1 = new javax.swing.JLabel();
        securityAnswer3 = new java.awt.TextField();
        securityQuestion3 = new javax.swing.JLabel();
        answerLabel2 = new javax.swing.JLabel();
        securityAnswer2 = new java.awt.TextField();
        securityQuestion2 = new javax.swing.JLabel();
        answerLabel3 = new javax.swing.JLabel();
        backButton = new java.awt.Button();
        messageLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setForeground(new java.awt.Color(51, 51, 51));
        setToolTipText("");

        logoLabe1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        logoLabe1.setForeground(new java.awt.Color(255, 255, 255));
        logoLabe1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        logoLabe1.setText("Lang");
        logoLabe1.setIconTextGap(0);

        logoLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        logoLabel2.setForeground(new java.awt.Color(1, 111, 160));
        logoLabel2.setText("Learner");
        logoLabel2.setIconTextGap(0);

        sendButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        sendButton.setLabel("Send");

        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String answer1Text = securityAnswer1.getText();
                String answer2Text = securityAnswer2.getText();
                String answer3Text = securityAnswer3.getText();
                Map<Integer, String> answersMap = new HashMap();
                answersMap.put(1, answer1Text);
                answersMap.put(2, answer2Text);
                answersMap.put(3, answer3Text);
                
                if (!answer1Text.equals("") && !answer2Text.equals("") && !answer3Text.equals("") ) {
                    checkAnswersActionPerformed(evt, con, email, answersMap, jf);
                } else messageLabel.setText("Fill all answers!");

                
            }
        });

        securityAnswer1.setBackground(new java.awt.Color(153, 153, 153));
        securityAnswer1.setBounds(new java.awt.Rectangle(10, 10, 10, 10));

        answerLabel1.setForeground(new java.awt.Color(255, 255, 255));
        answerLabel1.setText("Enter answer 1");

        securityQuestion1.setForeground(new java.awt.Color(255, 255, 255));
        securityQuestion1.setText("What was your first car?");

        securityAnswer3.setBackground(new java.awt.Color(153, 153, 153));
        securityAnswer3.setBounds(new java.awt.Rectangle(10, 10, 10, 10));

        securityQuestion3.setForeground(new java.awt.Color(255, 255, 255));
        securityQuestion3.setText("What was your childhood pet name?");

        answerLabel2.setForeground(new java.awt.Color(255, 255, 255));
        answerLabel2.setText("Enter answer 2");

        securityAnswer2.setBackground(new java.awt.Color(153, 153, 153));
        securityAnswer2.setBounds(new java.awt.Rectangle(10, 10, 10, 10));

        securityQuestion2.setForeground(new java.awt.Color(255, 255, 255));
        securityQuestion2.setText("What is your mothers maiden name?");

        answerLabel3.setForeground(new java.awt.Color(255, 255, 255));
        answerLabel3.setText("Enter answer 3");

        for (Integer category : questionMap.keySet()) {
            if (category == 1) {
                securityQuestion1.setText(questionMap.get(category));
            } else if (category == 2) {
                securityQuestion2.setText(questionMap.get(category));
            } else if (category == 3) {
                securityQuestion3.setText(questionMap.get(category));
            }
        }

        backButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        backButton.setLabel("<-");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new MainEmail(con, jf);
            }
        });

        messageLabel.setForeground(new java.awt.Color(255, 255, 255));
        messageLabel.setText("Please provide answres to my problems");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addComponent(logoLabe1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(logoLabel2)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(securityQuestion3, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(securityAnswer3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        )
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(securityAnswer1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                                                        .addComponent(messageLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(answerLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(answerLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(answerLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(securityQuestion1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(securityQuestion2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(securityAnswer2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(26, 26, 26))
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
                                        .addComponent(logoLabe1)
                                        .addComponent(logoLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addComponent(securityQuestion1)
                                .addGap(18, 18, 18)
                                .addComponent(answerLabel1)
                                .addGap(2, 2, 2)
                                .addComponent(securityAnswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(securityQuestion2)
                                .addGap(15, 15, 15)
                                .addComponent(answerLabel2)
                                .addGap(1, 1, 1)
                                .addComponent(securityAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(securityQuestion3)
                                .addGap(18, 18, 18)
                                .addComponent(answerLabel3)
                                .addGap(1, 1, 1)
                                .addComponent(securityAnswer3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(messageLabel)
                                .addGap(47, 47, 47)
                                .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95))
        );

        answerLabel1.getAccessibleContext().setAccessibleName("");

    }// </editor-fold>                        

    private void checkAnswersActionPerformed(java.awt.event.ActionEvent evt, Connection con, String em, Map<Integer, String> answersMap, JFrame jf) {

        SecurityAnswersUseCase secAnswers = new SecurityAnswersUseCase();
        
        if (secAnswers.getASecurityAnswers(em, con, answersMap)) {
            new MainResetPassword(con, em, jf);

        } else {
            messageLabel.setText("Wrong Answers!");
        }
        

    }

    private javax.swing.JLabel answerLabel1;
    private javax.swing.JLabel answerLabel2;
    private javax.swing.JLabel answerLabel3;
    private java.awt.Button backButton;
    private javax.swing.JLabel logoLabe1;
    private javax.swing.JLabel logoLabel2;
    private javax.swing.JLabel messageLabel;
    private java.awt.TextField securityAnswer1;
    private java.awt.TextField securityAnswer2;
    private java.awt.TextField securityAnswer3;
    private javax.swing.JLabel securityQuestion1;
    private javax.swing.JLabel securityQuestion2;
    private javax.swing.JLabel securityQuestion3;
    private java.awt.Button sendButton;

}
