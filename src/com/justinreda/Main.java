package com.justinreda;

import java.util.Scanner;

public class Main {

    private static String TRY_AGAIN_STRING = "\nTry again!\n";
    private static String CORRECT_STRING = "\nCorrect!\n";
    private static String SOLVE_X_STRING = "x = ?\n";
    private static String SOLVE_Y_STRING = "y = ?\n";

    private static String q1 = "Solve for x.\n6x - 3y = 5";
    private static String a1_terms_of_x = "1/2*y+5/6";

    public static void main(String[] args) {

        boolean questionOneCorrect = false;
        do {
            questionOneCorrect = question1();
        } while (!questionOneCorrect);

        //TODO ask question 2


        //TODO ask q3-5
    }

    private static boolean question1() {
        //TODO print question
        q1
        SOLVE_X_STRING

        //TODO get the next line of input from the console
        String input1 = ;

        //TODO Check input1 and make it so spaces and capitals in answer dont matter
        //hint replace spaces and make whole thing lowercase
        input1 =

        //TODO Check if answer solving for x is correct
        if (a1_terms_of_x) {
            //answer is correct
            CORRECT_STRING

            //TODO now solve in terms of y

            //TODO now solve for x

            //TODO now solve for y

            return true;
        } else {
            System.out.println(TRY_AGAIN_STRING);
            return false;
        }
    }

    private static boolean question2() {
        //TODO fill in q2
    }
}
