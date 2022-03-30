package com.translateapp.translateapp.usecase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import models.QuestionModel;

public class GetAllSecurityQuestions {

    public Map<Integer, List<QuestionModel>> getASecurityQuestions(Connection con) {

        PreparedStatement stmt = null;
        String sqlString = ("Select id, question, category from security_questions sq \n");

        Map<Integer, List<QuestionModel>> questionList = new HashMap();
        try {
            con.setAutoCommit(false);
            stmt = con.prepareStatement(sqlString);
            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                if (questionList.containsKey(result.getInt("category"))) {
                    List<QuestionModel> model = new ArrayList();
                    model.addAll(questionList.get(result.getInt("category")));
                    model.add(new QuestionModel(result.getString("question"), result.getInt("id")));
                    questionList.remove(result.getInt("category"));
                    questionList.put(result.getInt("category"), model);
                } else {
                    questionList.put(result.getInt("category"), List.of(new QuestionModel(result.getString("question"), result.getInt("id"))));
                }
            }
            stmt.close();
            con.commit();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        //Map<Integer, QuestionModel> integer is category id and questionModel contains questionId and string
        
        System.out.println("aaaaa" +questionList.toString());
        return questionList;
    }

}
