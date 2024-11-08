package services;

import java.util.Scanner;


public class Menu {

    private Scanner scan = new Scanner(System.in);


    public void showStartingMenu() {
        String menu = "";
        menu += " _______  __          ___           _______. __    __    ______     ___      .______      _______     .___  ___.      ___      .__   __.  __       ___      \n" +
                "|   ____||  |        /   \\         /       ||  |  |  |  /      |   /   \\     |   _  \\    |       \\    |   \\/   |     /   \\     |  \\ |  | |  |     /   \\     \n" +
                "|  |__   |  |       /  ^  \\       |   (----`|  |__|  | |  ,----'  /  ^  \\    |  |_)  |   |  .--.  |   |  \\  /  |    /  ^  \\    |   \\|  | |  |    /  ^  \\    \n" +
                "|   __|  |  |      /  /_\\  \\       \\   \\    |   __   | |  |      /  /_\\  \\   |      /    |  |  |  |   |  |\\/|  |   /  /_\\  \\   |  . `  | |  |   /  /_\\  \\   \n" +
                "|  |     |  `----./  _____  \\  .----)   |   |  |  |  | |  `----./  _____  \\  |  |\\  \\----|  '--'  |   |  |  |  |  /  _____  \\  |  |\\   | |  |  /  _____  \\  \n" +
                "|__|     |_______/__/     \\__\\ |_______/    |__|  |__|  \\______/__/     \\__\\ | _| `._____|_______/    |__|  |__| /__/     \\__\\ |__| \\__| |__| /__/     \\__\\ \n"
        ;
        menu += "\n";
        menu += " A product of Joshua B. Hardy \n";
        System.out.println(menu);
    }

    public String showSubMenu() {
        System.out.println("Welcome to model.Flashcard Mania! \nAre you ready to get started?" +
                "\t(Y)/(N)");
        String answer = scan.nextLine();
        return answer;
    }

    public int showQuestionMenu() {
        System.out.println("\nPlease choose from one of the following:" +
                "\n  1. Vocabulary Terms" +
                "\n  2. Interview Questions" +
                "\n  3. Exit Flashcard Mania");
        int userChoice = Integer.parseInt(scan.nextLine());
        System.out.println("\n");
        return userChoice;
    }

    public void showExitMenu() {
        System.out.println("Thanks for studying! Good luck coding!");
    }

    public int showSimpleMenu() {
        System.out.println("*** Vocabulary Questions ***" +
                "\n Please choose one of the following options: " +
                "\n  1. Show Question" +
                "\n  2. Show Answer" +
                "\n  3. Remove Question" +
                "\n  4. Return to Study Choices");
        int userChoice = Integer.parseInt(scan.nextLine());
        return userChoice;
    }

    public void invalidInput() {
        System.out.println("\nInvalid input. Please try again\n");
    }

    public void printQuestion(String question) {
        System.out.println("\n  " + question + "\n");
    }

    public void printAnswer(String answer) {
        System.out.println("\nThe answer is:\n" + answer + "\n");
    }

    public int showComplexMenu() {
        System.out.println("*** Interview Questions ***" +
                "\n Please choose one of the following options: " +
                "\n  1. Show Question" +
                "\n  2. Show Answer" +
                "\n  3. Remove Question" +
                "\n  4. Return to Study Choices");
        int userChoice = Integer.parseInt(scan.nextLine());
        return userChoice;
    }

    public void noQuestionsLeft() {
        System.out.println("\nThere are no more study questions left.\n");
    }

    public void noQuestionsToRemove() {
        System.out.println("\nThere are no more flashcards to remove.");
    }

    public void mustGetQuestion() {
        System.out.println("\nYou must choose a question first.\n");
    }

    public void printNewLine() {
        System.out.println("\n");
    }
}
