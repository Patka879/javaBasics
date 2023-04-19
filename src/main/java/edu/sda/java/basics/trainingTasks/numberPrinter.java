package edu.sda.java.basics.trainingTasks;

import java.util.Scanner;

/**
 * Write an application that reads from the user 10 arbitrarily large numbers
 * (variables of type int) and prints those that occurred at least twice.
 */
public class numberPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers");

        for (int i = 0; i < 10; i++) {
            System.out.println("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Numbers that occurred at least once: ");
        for (int i= 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++ ) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
