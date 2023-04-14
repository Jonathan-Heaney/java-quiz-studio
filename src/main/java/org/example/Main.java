package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> firstQuestionChoices = new ArrayList<>(Arrays.asList("1770", "1803", "1792", "1754"));
        MultipleChoice firstQuestion = new MultipleChoice("In what year was Beethoven born?", firstQuestionChoices, 1);
        firstQuestion.displayQuestion();
        firstQuestion.displayAnswerChoices();
        System.out.println("Select the number of the correct answer: ");
        Integer firstAnswer = input.nextInt();
        firstQuestion.checkAnswer(firstAnswer, firstQuestion.getCorrectAnswer());

    }
}