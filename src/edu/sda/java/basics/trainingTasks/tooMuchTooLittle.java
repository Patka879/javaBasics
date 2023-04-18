package edu.sda.java.basics.trainingTasks;

import java.util.Random;
import java.util.Scanner;

/**
 * Write an application that will play "too much, too little" game with you.
 * At the beginning the application should randomly choose a number from 0 to
 * 100 (hint: use the Random.nextInt() method) and wait for the user to enter a number.
 * If the user gives a number greater than the number chosen by the computer, your
 * application should print "too much" and wait for the next number. If the user
 * gives a smaller number, the application should print "not enough" and wait for
 * the next number in the same way. If the user provides the exact value, the application
 * should print the word "Congratulations!" and finish.
 */

public class tooMuchTooLittle {
    public static void main(String[] args) {
        Random ran = new Random();
        int nxt = ran.nextInt(100000);
        System.out.println("This is my number: " + nxt);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number bigger than 0: ");
        int numb = scanner.nextInt();


        while (true) {


            if (numb > nxt) {
                System.out.print("Too much, try again: ");
                numb = scanner.nextInt();
            } else if (numb < nxt) {
                System.out.print("Too little, try again: ");
                numb = scanner.nextInt();
            } else {
                System.out.print("Congratulation!");
                break;
            }
        }
    }
}
