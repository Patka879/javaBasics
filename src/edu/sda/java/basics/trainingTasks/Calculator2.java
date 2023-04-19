package edu.sda.java.basics.trainingTasks;

import java.util.Scanner;

/**
 * Write an application that implements a simple calculator. The application should:
 *  a. read first number (type float)
 *  b. read one of following symbols: + - / *
 *  c. read second number (type float)
 *  d. return a result of given mathematical operation
 * If the user provides a symbol other than supported, the application should print "Invalid symbol".
 * If the entered action cannot be implemented (i.e. it is inconsistent with the principles of mathematics),
 * the application should print "Cannot calculate".
 */
public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number...");
        float num1 = scanner.nextFloat();
        System.out.println("Enter a symbol (+, -, /, *)...");
        String operator = scanner.next();
        System.out.println("Enter a second number: ");
        float num2 = scanner.nextFloat();
        float result = 0;
        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("/")) {
            result = num1 / num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else {
            System.out.print("Cannot calculate");
        }
        System.out.print(result);
    }
}
