package org.example;

import java.util.ArrayList;

public class Checkbox extends Question {
    private ArrayList<String> correctAnswers;
    public Checkbox(String question, ArrayList answerChoices, ArrayList correctAnswers) {
        super(question, answerChoices);
        this.correctAnswers = correctAnswers;
    }

    public Boolean checkAnswer(ArrayList userAnswers, ArrayList correctAnswers) {
        return userAnswers == correctAnswers;
    }

    public ArrayList getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(ArrayList correctAnswers) {
        this.correctAnswers = correctAnswers;
    }



}
