package com.translateapp.translateapp.usecase;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Formatter;
import java.util.Map;

public class RegisterUserUseCase {

    private static String byteToHex(final byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash) {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }

    public void registerUser(String name, String surname, String email, Connection con, String password, Map<Integer, String> questionMap, int role) {
//Map<Integer, String> questionMap -> integer is question id, string is answer by user
        String sha1 = "";
        try {
            MessageDigest crypt = MessageDigest.getInstance("SHA-1");
            crypt.reset();
            crypt.update(password.getBytes("UTF-8"));
            sha1 = byteToHex(crypt.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(sha1);
        System.out.println(questionMap);
        PreparedStatement stmt = null;
        //by default role is 1 - user;
        String sqlString = ("insert into user (name, surname, email, password, role) values (?,?,?,?,?);");

        try {
            con.setAutoCommit(false);
            stmt = con.prepareStatement(sqlString);
            stmt.setString(1, name);
            stmt.setString(2, surname);
            stmt.setString(3, email);
            stmt.setString(4, sha1);
            stmt.setInt(5, role);

            stmt.executeUpdate();

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    String secondSqlString = ("insert into user_questions (user_id, question_id, answer) values (?,?,?), (?,?,?),(?,?,?);");
                    stmt = con.prepareStatement(secondSqlString);
                    stmt.setInt(1, (int) generatedKeys.getLong(1));
                    stmt.setInt(2, (Integer) questionMap.keySet().toArray()[0]);
                    stmt.setString(3, (String) questionMap.values().toArray()[0]);
                    
                    stmt.setInt(4, (int) generatedKeys.getLong(1));
                    stmt.setInt(5, (Integer) questionMap.keySet().toArray()[1]);
                    stmt.setString(6, (String) questionMap.values().toArray()[1]);
                    
                    stmt.setInt(7, (int) generatedKeys.getLong(1));
                    stmt.setInt(8, (Integer) questionMap.keySet().toArray()[2]);
                    stmt.setString(9, (String) questionMap.values().toArray()[2]);
                    stmt.executeUpdate();

                } else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
            }
            stmt.close();
            con.commit();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

}
