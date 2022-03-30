package com.translateapp.translateapp.usecase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class SecurityQuestionsUseCase {

    public Map<Integer,String> getASecurityQuestions(String email, Connection con) {

        PreparedStatement stmt = null;
        String sqlString = ("Select question, sq.category from user_questions uq \n"
                + "inner join security_questions sq on uq.question_id = sq.id\n"
                + "inner join user u on uq.user_id =u.id\n"
                + "where u.email =?");

        Map<Integer,String> questionList = new HashMap();
        try {
            con.setAutoCommit(false);
            stmt = con.prepareStatement(sqlString);
            stmt.setString(1, email);
            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                questionList.put(result.getInt("category"),result.getString("question"));
            }
            stmt.close();
            con.commit();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        return questionList;
    }

}
