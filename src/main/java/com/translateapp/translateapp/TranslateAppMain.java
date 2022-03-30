package com.translateapp.translateapp;

import com.translateapp.translateapp.frontend.Main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sqlite.SQLiteConfig;
import org.sqlite.SQLiteOpenMode;

public class TranslateAppMain {

    public static void main(String[] args) {

        System.out.println("Hello. We start here!");
        Connection conn = null;
        SQLiteConfig config = new SQLiteConfig();
        config.setOpenMode(SQLiteOpenMode.READWRITE);
        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:transApp.db";
            conn = DriverManager.getConnection(url, config.toProperties());
            System.out.println("Connection to SQLite has been established.");

            new Main(conn);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TranslateAppMain.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
//        finally {
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
    }

}
