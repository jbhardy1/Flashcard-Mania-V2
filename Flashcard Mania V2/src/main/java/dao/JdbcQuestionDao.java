package dao;

import exception.DaoException;
import model.Question;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import javax.sql.DataSource;

public class JdbcQuestionDao implements QuestionDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcQuestionDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Question> getQuestionList(String type) {
        List<Question> questionList = new ArrayList<>();

        String sql = "SELECT * FROM questions WHERE question_type = ?";
        try {
            SqlRowSet rs = jdbcTemplate.queryForRowSet(sql, type);
            while (rs.next()) {
                questionList.add(mapRowToQuestion(rs));
            }
        } catch (CannotGetJdbcConnectionException ex) {
            throw new DaoException("Could not retrieve question list of the specified type");
        }

        return questionList;
    }

    public Question mapRowToQuestion(SqlRowSet rs) {
        Question question = new Question();

        question.setQuestionNumber(rs.getInt("question_number"));
        question.setQuestion(rs.getString("question"));
        question.setAnswer(rs.getString("question_answer"));
        question.setQuestionType(rs.getString("question_type"));

        return question;
    }
}
