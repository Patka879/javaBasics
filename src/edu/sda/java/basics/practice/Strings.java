package edu.sda.java.basics.practice;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        canEnter();
        calculator();
        printName();
    }

        private static void calculator() {
            System.out.print("========");
            System.out.println("Write first number");
            Scanner scanner = new Scanner(System.in);
            Integer number1 = scanner.nextInt();
            System.out.println("Write a second number");
            Integer number2 = scanner.nextInt();
            System.out.println(number1 - number2);
            System.out.println(number1 / number2);
            System.out.println(number1 * number2);
        }

    private static void canEnter() {
        System.out.println("Your height");
        Scanner scanner = new Scanner(System.in);
        Integer height = scanner.nextInt();
        System.out.println("Your weight");
        Integer weight = scanner.nextInt();

        if(height < 150 || weight < 180) {
            System.out.println("Sorry we cannot let You in");
        } else {
            System.out.println("You can enter");
        }
    }

    private static void printName() {
        System.out.print("========");
        System.out.println("What is Your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What is Your surname?");
        String surname = scanner.nextLine();
        System.out.print("Hello "  + name + " " + surname);
    }
}
