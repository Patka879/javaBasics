package edu.sda.java.basics.practice;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        canEnter();
        calculator();
        printName();
        addNumbers();
        ageConsentForm();
    }

    private static void calculator() {
        System.out.println("========");
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
        System.out.println("========");
        System.out.println("Your height");
        Scanner scanner = new Scanner(System.in);
        Integer height = scanner.nextInt();
        System.out.println("Your weight");
        Integer weight = scanner.nextInt();

        if(height < 150 || weight > 180) {
            System.out.println("Sorry we cannot let You in");
        } else {
            System.out.println("You can enter");
        }
    }

    private static void printName() {
        System.out.println("========");
        System.out.println("What is Your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What is Your surname?");
        String surname = scanner.nextLine();
        System.out.println("Hello "  + name + " " + surname + " ");
    }

    private static void addNumbers() {
        System.out.println("========");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = scanner.nextInt();
        System.out.println("Enter another number");
        int num2 = scanner.nextInt();
        System.out.println("Sum is: " + num1 + num2);
    }

    private static void ageConsentForm() {
        System.out.println("========");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Your Age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Sorry, You can't access the page");
        } else {
            System.out.print("Welcome to the page " + name);
        }
    }
}
