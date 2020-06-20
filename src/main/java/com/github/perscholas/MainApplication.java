package com.github.perscholas;

import java.io.InputStream;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        InputStream inputFromKeyboard = System.in;
        Scanner inputScanner = new Scanner(inputFromKeyboard);
        NameEvaluator nameEvaluator = new NameEvaluator();

        System.out.println("Please enter your name");
        String name = inputScanner.nextLine();
        if(nameEvaluator.isValidName(name)) {
            String output = nameEvaluator.getNameEvaluation(name);
            System.out.println(output);
        }
    }
}
