package org.example;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    private Integer correctAnswer;
    public MultipleChoice(String question, ArrayList<String> answerChoices, Integer correctAnswer) {
        super(question, answerChoices);
        this.correctAnswer = correctAnswer;
    }

    public void checkAnswer(Integer userAnswer, Integer correctAnswer) {
        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect! The correct answer was " + this.correctAnswer);
        }
    }
    public Integer getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Integer correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
