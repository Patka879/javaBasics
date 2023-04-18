package edu.sda.java.basics.trainingTasks;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Write an application that reads a text from the user (type String)
 * and counts a percentage of occurrences of a space character.
 */
public class PercentageOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        int totalCharacters = input.length();
        DecimalFormat df = new DecimalFormat("##.##%");
        int whiteSpacesNumber =  totalCharacters - input.replace(" ","").length();
        double whiteSpacePercentage = (double) whiteSpacesNumber / totalCharacters;
        String formattedPercent = df.format(whiteSpacePercentage);
        System.out.print("There are " + totalCharacters + " characters in this sentence" + "\n" +
                            formattedPercent + " of those characters are white spaces");
    }
}
