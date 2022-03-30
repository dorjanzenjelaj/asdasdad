package com.translateapp.translateapp.frontend;

import com.translateapp.translateapp.usecase.GetAllSecurityQuestions;
import com.translateapp.translateapp.usecase.RegisterUserUseCase;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import models.QuestionModel;

public class SetSecurityQuestionView extends javax.swing.JPanel {

    SetSecurityQuestionView(Connection con, JFrame jf, String name, String surname, String email, String password, int role) {
        initComponents(con, jf, name, surname, email, password, role);
    }

    private void initComponents(Connection con, JFrame jf, String name, String surname, String email, String password, int role) {
        setVisible(true);

        GetAllSecurityQuestions allSecurityQuestionsUseCase = new GetAllSecurityQuestions();
        Map<Integer, List<QuestionModel>> questionMap = allSecurityQuestionsUseCase.getASecurityQuestions(con);

        logoLabel1 = new javax.swing.JLabel();
        logoLabel2 = new javax.swing.JLabel();
        registerButton = new java.awt.Button();
        securityAnswer1 = new java.awt.TextField();
        securityAnswerLabel1 = new javax.swing.JLabel();
        securityAnswer2 = new java.awt.TextField();

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

        JComboBox securityQuestion1 = new JComboBox();
        JComboBox securityQuestion2 = new JComboBox();
        JComboBox securityQuestion3 = new JComboBox();
        securityQuestion1.addItem(new Item(0, "-"));
        securityQuestion2.addItem(new Item(0, "-"));
        securityQuestion3.addItem(new Item(0, "-"));

        for (QuestionModel object : questionMap.get(1)) {

            securityQuestion1.addItem(new Item(object.getId(), object.getQuestion()));
        }
        for (QuestionModel object : questionMap.get(2)) {

            securityQuestion2.addItem(new Item(object.getId(), object.getQuestion()));
        }
        for (QuestionModel object : questionMap.get(3)) {

            securityQuestion3.addItem(new Item(object.getId(), object.getQuestion()));
        }

        securityQuestion1.setPrototypeDisplayValue(" None of the above ");
        securityQuestion2.setPrototypeDisplayValue(" None of the above ");
        securityQuestion3.setPrototypeDisplayValue(" None of the above ");

        final AtomicInteger question1 = new AtomicInteger();
        final AtomicInteger question2 = new AtomicInteger();
        final AtomicInteger question3 = new AtomicInteger();

        securityQuestion1.addActionListener(e -> {
            JComboBox c = (JComboBox) e.getSource();
            Item item = (Item) c.getSelectedItem();
            question1.addAndGet(item.getId());
            System.out.println(item.getId() + " : " + item.getDescription());
        });
        securityQuestion2.addActionListener(e -> {
            JComboBox c = (JComboBox) e.getSource();
            Item item = (Item) c.getSelectedItem();
            question2.addAndGet(item.getId());
            System.out.println(item.getId() + " : " + item.getDescription());
        });
        securityQuestion3.addActionListener(e -> {
            JComboBox c = (JComboBox) e.getSource();
            Item item = (Item) c.getSelectedItem();
            question3.addAndGet(item.getId());
            System.out.println(item.getId() + " : " + item.getDescription());
        });
  

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

        registerButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        registerButton.setLabel("Register");
               registerButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String answer1 = securityAnswer1.getText();
                String answer2 = securityAnswer2.getText();
                String answer3 = securityAnswer3.getText();

                if (!answer1.equals("") && !answer2.equals("") && !answer3.equals("")) {
                    Map<Integer, String> map = new HashMap();
                    map.put(question1.get(), answer1);
                    map.put(question2.get(), answer2);
                    map.put(question3.get(), answer3);

                    registerButtonActionPerformed(evt, con, jf, name, surname, email, password, map, role);
                } else {
                    messageLabel.setText("Questions and answers please!");
                }

            }

        });

        securityAnswer1.setBackground(new java.awt.Color(153, 153, 153));
        securityAnswer1.setBounds(new java.awt.Rectangle(10, 10, 10, 10));

        securityAnswerLabel1.setForeground(new java.awt.Color(255, 255, 255));
        securityAnswerLabel1.setText("Enter Answer 1");

        securityAnswer2.setBackground(new java.awt.Color(153, 153, 153));
        
        securityQuestionLabel1.setForeground(new java.awt.Color(255, 255, 255));
        securityQuestionLabel1.setText("Security Question 1");

        securityAnswerLabel3.setForeground(new java.awt.Color(255, 255, 255));
        securityAnswerLabel3.setText("Enter answer 3");

        securityQuestionLabel2.setForeground(new java.awt.Color(255, 255, 255));
        securityQuestionLabel2.setText("Security Question 2");

        securityAnswer3.setBackground(new java.awt.Color(153, 153, 153));

        securityAnswerLabel2.setForeground(new java.awt.Color(255, 255, 255));
        securityAnswerLabel2.setText("Enter answer 2");

        securityQuestionLabel3.setForeground(new java.awt.Color(255, 255, 255));
        securityQuestionLabel3.setText("Security Question 3");
        
        backButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        backButton.setLabel("<-");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new MainRegisterUser(con, jf);
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
                                )))
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
    }                       

    class ItemRenderer extends BasicComboBoxRenderer {

        @Override
        public Component getListCellRendererComponent(JList list, Object value,
                int index, boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected,
                    cellHasFocus);
            if (value != null) {
                Item item = (Item) value;
                setText(item.getDescription().toUpperCase());
            }
            if (index == -1) {
                Item item = (Item) value;
                setText("" + item.getId());
            }
            return this;
        }
    }

    private void registerButtonActionPerformed(ActionEvent evt, Connection con, JFrame jf, String name, String surname, String email, String password, Map<Integer, String> map, int role) {
        RegisterUserUseCase registerBitch = new RegisterUserUseCase();
        registerBitch.registerUser(name, surname, email, con, password, map, role);
        
        messageLabel.setText("User was registered!");
        System.out.println("done");
        
        int timeout_ms = 1000;//3 * 1000
        Timer timer = new Timer();
        timer.schedule(new SetSecurityQuestionView.CloseDialogTask(jf, con), timeout_ms);
        
        
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

    // Variables declaration - do not modify                     
    private java.awt.Button backButton;
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

}

class Item {

    private int id;
    private String description;

    public Item(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
