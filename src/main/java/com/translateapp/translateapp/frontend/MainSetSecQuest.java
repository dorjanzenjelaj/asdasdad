package com.translateapp.translateapp.frontend;

import java.awt.FlowLayout;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainSetSecQuest {

    public MainSetSecQuest(Connection con, JFrame jf, String name, String surname, String email, String password, int role) {
        initComponents(con, jf, name, surname, email, password, role);
    }

    private void initComponents(Connection con, JFrame jf, String name, String surname, String email, String password, int role) {
        jf.getContentPane().removeAll();
        jf.setVisible(true);
        jf.setBounds(0, 0, 339, 768);
        jf.getContentPane().setLayout(null);

        FlowLayout mainLayout = new FlowLayout();
        mainLayout.setHgap(0);
        mainLayout.setVgap(0);
        jf.setResizable(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(mainLayout);

        JPanel panelMain = new JPanel(mainLayout);
        panelMain.setBounds(0, 0, 339, 768);
        
        SetSecurityQuestionView panel = new SetSecurityQuestionView(con, jf, name, surname, email, password, role);
        panelMain.add(panel);
        panel.setVisible(true);
        panel.setBounds(0, 0, 339, 768);
        jf.add(panelMain);
        jf.getContentPane().add(panelMain);
        jf.getContentPane().revalidate();
        jf.repaint();

    }
}
