package edu.sda.java.basics.trainingTasks;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Write an application that gets one positive number (type int) from the user
 * and calculates a sum of digits of the given number. Hint: to make some operations
 * on every single digit of the number (digit by digit), you can calculate the remainder
 * of dividing the number by 10 (to get the value of the last digit) and divide the number
 * by 10 (to "move" to the next digit). Or you can read number as String and use split("")
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number...");
        int num = scanner.nextInt();

        int sum = 0;
        int divisionResult = num;

        while (divisionResult > 0) {
            int integer = num % 10;
            sum += integer;
            divisionResult /= 10;
        }

        System.out.print("Sum of digits of " + num + " equals " + sum);
    }
}
