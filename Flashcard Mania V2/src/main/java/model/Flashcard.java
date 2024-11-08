package model;
import dao.JdbcQuestionDao;
import dao.QuestionDao;
import java.util.List;
import java.util.Random;
import org.apache.commons.dbcp2.BasicDataSource;
public class Flashcard {

    private Random random = new Random();
    private int randomQuestion;
    private List<Question> vocabQuestions;
    private List<Question> interviewQuestions;
    private QuestionDao questionDao;

    public Flashcard() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/Flashcards");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");
        this.questionDao = new JdbcQuestionDao(dataSource);
        this.vocabQuestions = questionDao.getQuestionList("Vocab");
        this.interviewQuestions = questionDao.getQuestionList("Interview");
    }


    public int vocabListSize() {
        return vocabQuestions.size();
    }

    public Question getVocabQuestion() {
        randomQuestion = random.nextInt(0, vocabQuestions.size());
        return vocabQuestions.get(randomQuestion);
    }

    public Question getVocabAnswer() {
        return vocabQuestions.get(randomQuestion);
    }

    public void removeVocabQuestion() {
        vocabQuestions.remove(randomQuestion);
    }

    public int interviewListSize() {
        return interviewQuestions.size();
    }

    public Question getInterviewQuestion() {
        randomQuestion = random.nextInt(0, interviewQuestions.size());
        return interviewQuestions.get(randomQuestion);
    }


    public Question getInterviewAnswer() {
        return interviewQuestions.get(randomQuestion);
    }

    public void removeInterviewQuestion() {
        interviewQuestions.remove(randomQuestion);
    }
}