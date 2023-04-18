package edu.sda.java.basics.trainingTasks;

import java.util.Scanner;

/**
 * Write an application that takes a positive number from the user (type int) and writes all
 * numbers from 1 to the given number, each on the next line, with the following changes:
 * ● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
 * ● in place of numbers divisible by 7, instead of a number the program should write
 * "Buzz"
 * ● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"
 */
public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter positive number");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
