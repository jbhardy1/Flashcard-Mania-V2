package dao;

import model.Question;

import java.util.List;

public interface QuestionDao {

    List<Question> getQuestionList(String type);
}
