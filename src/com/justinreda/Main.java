package com.justinreda;

import java.util.Scanner;

public class Main {

    private static String TRY_AGAIN_STRING = "\nTry again!\n";
    private static String CORRECT_STRING = "\nCorrect!\n";
    private static String SOLVE_X_STRING = "x = ?\n";
    private static String SOLVE_Y_STRING = "y = ?\n";

    private static String q1 = "Solve for x.\n6x - 3y = 5";
    private static String a1 = "1/2*y+5/6";

    public static void main(String[] args) {
	    // write your code here

        boolean questionOneCorrect = false;
        do {
            questionOneCorrect = question1();
        } while (!questionOneCorrect);

        //TODO ask more questions
    }

    private static boolean question1() {
        //TODO print question
        System.out.println(q1);
        System.out.println(SOLVE_X_STRING);

        //TODO get the next line of input from the console
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();

        //TODO Check input1 and make it so spaces and capitals in answer dont matter
        input1 = input1.replaceAll(" ", "").toLowerCase();

        //TODO Check if answer solving for x is correct
        if (input1.equals(a1)) {
            System.out.println(CORRECT_STRING);

            //TODO now solve in terms of y

            //TODO now solve for x

            //TODO now solve for y

            return true;
        } else {
            System.out.println(TRY_AGAIN_STRING);
            return false;
        }
    }
}
