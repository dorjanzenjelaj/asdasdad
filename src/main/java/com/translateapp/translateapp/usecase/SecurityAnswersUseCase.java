package com.translateapp.translateapp.usecase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class SecurityAnswersUseCase {

    public Boolean getASecurityAnswers(String email, Connection con, Map<Integer, String> answers) {

        PreparedStatement stmt = null;
        String sqlString = ("Select answer, sq.category from user_questions uq \n"
                + "inner join security_questions sq on uq.question_id = sq.id\n"
                + "inner join user u on uq.user_id =u.id\n"
                + "where u.email =?");

        Map<Integer, String> answerList = new HashMap();
        try {
            con.setAutoCommit(false);
            stmt = con.prepareStatement(sqlString);
            stmt.setString(1, email);
            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                answerList.put(result.getInt("category"), result.getString("answer"));
            }
            stmt.close();
            con.commit();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

        for (Integer category : answerList.keySet()) {
            if (!answers.get(category).equals(answerList.get(category))) {
                return false;
            }
        }
        return true;
    }

}
