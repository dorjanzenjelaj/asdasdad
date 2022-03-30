package models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class QuestionModel {
    private Integer id;
    private String question;

    public QuestionModel(String question, Integer id) {
        this.question = question;
        this.id = id;
    }
   
    
}
