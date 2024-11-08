package model;

import services.Menu;

/**
 * TODO:
 *  Create way to re-initialize flashcard "pile"
 *  Add more questions
 *  Format output more
 *  Cleanup methods
 *  Add JUnit Testing
 */

public class Application {

    private Menu menu = new Menu();
    private Flashcard flashcard = new Flashcard();
    private boolean hasQuestion = false;


    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    public void run() {

        menu.showStartingMenu();
        String userInput = menu.showSubMenu();

        boolean isStudying = true;
        while (isStudying) {
            if (userInput.equalsIgnoreCase("Y")) {
                int studyChoice = menu.showQuestionMenu();
                switch (studyChoice) {
                    case 1:
                        retrieveVocabQuestions();
                        break;
                    case 2:
                        retrieveInterviewQuestions();
                        break;
                    case 3:
                        menu.showExitMenu();
                        isStudying = false;
                        break;
                    default:
                        menu.invalidInput();
                        break;
                }
            } else if (userInput.equalsIgnoreCase("N")) {
                menu.showExitMenu();
                isStudying = false;
            } else {
                menu.invalidInput();
                userInput = menu.showSubMenu();
            }
        }

    }

    public void retrieveVocabQuestions() {
        boolean vocabQuiz = true;
        while (vocabQuiz) {
            int vocabChoice = menu.showSimpleMenu();
            switch (vocabChoice) {
                case 1:
                    if (flashcard.vocabListSize() > 0) {
                        menu.printQuestion(flashcard.getVocabQuestion().getQuestion());
                        hasQuestion = true;
                    } else {
                        menu.noQuestionsLeft();
                    }
                    break;
                case 2:
                    if (hasQuestion) {
                        if (flashcard.vocabListSize() > 0) {
                            menu.printAnswer(flashcard.getVocabAnswer().getAnswer());
                        } else {
                            menu.noQuestionsLeft();
                        }
                    } else {
                        menu.mustGetQuestion();
                    }
                    break;
                case 3:
                    if (hasQuestion) {
                        if (flashcard.vocabListSize() > 0) {
                            flashcard.removeVocabQuestion();
                            menu.printNewLine();
                            hasQuestion = false;
                        } else {
                            menu.noQuestionsToRemove();
                        }
                    } else {
                        menu.mustGetQuestion();
                    }
                    break;
                case 4:
                    vocabQuiz = false;
                    break;
                default:
                    menu.invalidInput();
            }
        }
    }

    public void retrieveInterviewQuestions(){
        boolean interviewQuiz = true;
        while(interviewQuiz){
            int interviewChoice = menu.showComplexMenu();
            switch(interviewChoice){
                case 1:
                    if(flashcard.interviewListSize() > 0) {
                        menu.printQuestion(flashcard.getInterviewQuestion().getQuestion());
                        hasQuestion = true;
                    }
                    else{
                        menu.noQuestionsLeft();
                    }
                    break;
                case 2:
                    if(hasQuestion) {
                        if (flashcard.interviewListSize() > 0) {
                            menu.printAnswer(flashcard.getInterviewAnswer().getAnswer());
                        } else {
                            menu.noQuestionsLeft();
                        }
                    }
                    else{
                        menu.mustGetQuestion();
                    }
                    break;
                case 3:
                    if(hasQuestion) {
                        if (flashcard.interviewListSize() > 0) {
                            flashcard.removeInterviewQuestion();
                            menu.printNewLine();
                            hasQuestion = false;
                        } else {
                            menu.noQuestionsToRemove();
                        }
                    }
                    else{
                        menu.mustGetQuestion();
                    }
                    break;
                case 4:
                    interviewQuiz = false;
                    break;
                default:
                    menu.invalidInput();
                    break;
            }
        }
    }
}