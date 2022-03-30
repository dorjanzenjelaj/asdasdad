package com.translateapp.translateapp.usecase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmailValidationUseCase {

    public boolean validateMail(String email, Connection con) {

        PreparedStatement stmt = null;
        String sqlString = ("Select email from user u "
                + "where u.email =?");

        try {
            con.setAutoCommit(false);
            stmt = con.prepareStatement(sqlString);
            stmt.setString(1, email);
            ResultSet result = stmt.executeQuery();
            if (result.next() == false) {
                return false;
            }
            stmt.close();
            con.commit();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        return true;
    }

}
