package edu.sda.java.basics.trainingTasks;

import java.util.Scanner;

/**
 * Write an application that will take a positive number from the user (type int)
 * and calculate the Fibonacci number at the indicated index.
 * For example, if the number equals 5, your program should print the fifth Fibonacci number.
 * In Fibonacci sequence, each number is the sum of the two preceding ones.
 * For example, the first few Fibonacci numbers are:
 *
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377...
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int n = scanner.nextInt();
        scanner.close();

        int lastNumber = fibonacci(n - 1); // Calculate the last number in the sequence
        System.out.println(n + "th number in the Fibonacci sequence is " + lastNumber);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
