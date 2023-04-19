package edu.sda.java.basics.trainingTasks;

import java.util.Scanner;

/**
 * Write an application that takes 10 numbers from the user (type int) and write the length of the
 * longest such subsequence of these numbers, which is increasing.
 * For example, for the numbers: "1, 3, 8, 4, 2, 5, 6, 11, 13, 7" the program should write "5" as
 * the length of the longest increasing subsequence (2, 5, 6, 11, 13).
 */
public class SequenceCounter {
    public static void main(String[] arr) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers higher than 0");

        for( int i = 0; i < 10; i++) {
            System.out.println("Number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();

            if (numbers[i] <= 0) {
                System.out.println("Please enter valid numbers only");
                break;
            }
        }

        int[] longestSubsequenceArray = new int[10];
        longestSubsequenceArray[0] = 1;

        for (int i = 0; i < numbers.length; i++) {
            longestSubsequenceArray[i] = 1;
            for (int j = 0; j < i; j++) {
                if (numbers[i] > numbers[j] && longestSubsequenceArray[i] < longestSubsequenceArray[j] + 1) {
                    longestSubsequenceArray[i] = longestSubsequenceArray[j] + 1;
                }
            }
        }

        int maxLength = longestSubsequenceArray[0];
        for (int i = 1; i < 10; i++) {
            if (longestSubsequenceArray[i] > maxLength) {
                maxLength = longestSubsequenceArray[i];
            }
        }

        System.out.print("The length of longest subsequence array is: " + maxLength);
    }
}
