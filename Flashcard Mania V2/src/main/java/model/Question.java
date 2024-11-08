package model;


public class Question {
    private int questionNumber;
    private String question;
    private String answer;
    private String questionType;

    public Question(int questionNumber, String question, String answer, String questionType) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.answer = answer;
        this.questionType = questionType;
    }

    public Question() {

    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }
}
