package edu.sda.java.basics.practice;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        // definition of pattern we want find
        Pattern pattern = Pattern.compile("hello");
        // check if this definition in given input
        Matcher matcher = pattern.matcher("xyz babla");
        System.out.println("Exact match: " + matcher.matches());
        System.out.println("Pattern found: " + matcher.find());

        System.out.println("abcd");
        String sampleString = "abcd";
        //we use same pattern definition and apply it to another string
        Matcher another = pattern.matcher(sampleString);
        System.out.println(another.find());

        System.out.print("=============");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        for (String word : words) {
            if (Character.isUpperCase(word.charAt(0))) {
                System.out.print(word);
            }
        }
    }
}


