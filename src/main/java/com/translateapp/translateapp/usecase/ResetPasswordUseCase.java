package com.translateapp.translateapp.usecase;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Formatter;

public class ResetPasswordUseCase {

    private static String byteToHex(final byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash) {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }

    public Boolean updatePassword(String email, Connection con, String password) {

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

        PreparedStatement stmt = null;
        String sqlString = ("update user set password = ? where email =?");

        try {
            con.setAutoCommit(false);
            stmt = con.prepareStatement(sqlString);
            stmt.setString(1, sha1);
            stmt.setString(2, email);

            stmt.executeUpdate();
            stmt.close();
            con.commit();
            return true;
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        return false;
    }

}
