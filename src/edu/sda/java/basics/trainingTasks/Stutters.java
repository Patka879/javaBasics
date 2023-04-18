/**
 * Write an application that "stutters", that is, reads the user's text (type String), and prints the given text, in which each word is printed twice.
 * For example, for the input: "This is my test" the application should print "This This is is my my test test".
 */

package edu.sda.java.basics.trainingTasks;

import java.util.Scanner;

public class Stutters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your sentence");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        String stutter = "";
        for (int i = 0; i < words.length; i++) {
            stutter += words[i] + " " +  words[i] + " ";
        }
        System.out.print("Stutter: " + stutter);
    }
}
