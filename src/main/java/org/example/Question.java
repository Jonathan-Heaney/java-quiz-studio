package org.example;

import java.util.ArrayList;

public abstract class Question {
    private String question;
    private ArrayList<String> answerChoices;

    public Question(String question, ArrayList<String> answerChoices) {
        this.question = question;
        this.answerChoices = answerChoices;
    }

    // Methods
    public void displayQuestion() {
        System.out.println(this.question);
    }

    public void displayAnswerChoices() {
        int i = 0;
        for(String choice : this.answerChoices) {
            i++;
            System.out.println(i + ". " + choice);
        }
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(ArrayList answerChoices) {
        this.answerChoices = answerChoices;
    }
}
