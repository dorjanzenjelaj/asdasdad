
package com.translateapp.translateapp.frontend;

import java.awt.FlowLayout;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main extends JFrame {

    public Main(Connection con) {
        initComponents(con);
    }
    
    public Main(Connection con, JFrame jf) {
        initComponents(con, jf);
    }
    
    private void initComponents(Connection con, JFrame jf) {
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
        
        LoginView panel = new LoginView(con, jf);
        panelMain.add(panel);
        panel.setVisible(true);
        panel.setBounds(0, 0, 339, 768);
        jf.add(panelMain);
        jf.getContentPane().add(panelMain);
        jf.getContentPane().revalidate();
        jf.repaint();

    }

    private void initComponents(Connection con) {
        setVisible(true);
     
        setBounds(0, 0, 339, 768);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        getContentPane().setLayout(null);

        FlowLayout mainLayout = new FlowLayout();
        mainLayout.setHgap(0);
        mainLayout.setVgap(0);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(mainLayout);

        JPanel panelMain = new JPanel(mainLayout);
        panelMain.setBounds(0, 0, 339, 768);
        
        LoginView panel = new LoginView(con, this);
        panelMain.add(panel);
        panel.setVisible(true);
        panel.setBounds(0, 0, 339, 768);
        add(panelMain);
        getContentPane().add(panelMain);
        getContentPane().revalidate();
        

    }
}
