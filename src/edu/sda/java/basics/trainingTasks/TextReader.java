package edu.sda.java.basics.trainingTasks;

import java.util.Scanner;

/**
 * Write an application that will read texts (variables of the String type) until the user gives the
 * text "Enough!" and then writes the longest of the given texts (not including the text "Enough!").
 * If the user does not provide any text, write "No text provided".
 */
public class TextReader {
    public static void main(String[] args) {
        String allInputs = "";
        String longestWord = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter text: (Type Enough! to stop) ");
        String input = "";

        while (true) {
            input = scanner.nextLine();

            if (input.equals("Enough!")) {
                break;
            }

            if (input.length() > longestWord.length()) {
                longestWord = input;
            }
        }
            if(longestWord.length() == 0) {
                System.out.print("No text provided");
            } else {
                System.out.print("The longest text is: " + longestWord);
            }
    }
}

