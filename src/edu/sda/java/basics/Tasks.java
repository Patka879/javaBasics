package edu.sda.java.basics;

public class Tasks {
    public static void main(String[] args) {
        stars();
        calculateAdd();
        division();
        printingSigns();
    }
    private static void stars() {
        String star = "";
        for (int i = 1; i <= 30; i++) {
            star += "*";
            if (i == 10 || i == 20) {
                continue;

            }
            System.out.println(star);
        }
    }

    private static void calculateAdd() {
        int firstInt = 10;
        int secondInt = 50;
        int sumInt = firstInt + secondInt;
        System.out.println(sumInt);
        if (sumInt > 57) {
            System.out.println("Big number");
        }
    }

    private static void division() {
        int firstInt = 10;
        int secondInt = 0;
        if (secondInt == 0) {
            System.out.println("Second number is 0");
        } else {
            int divided = firstInt - secondInt;
            System.out.println("Numbers are: " + firstInt + " and " + secondInt + " Result is " + divided);
        }
    }

    private static void printingSigns() {
        String star = "";
        for (int i = 1; i <= 50; i++) {
            star += "*";
            if (i % 2 == 0) {
                System.out.println(star + "++");
            } else if (i % 7 == 0) {
                System.out.println(star + 7);
            } else if (i % 4 == 3) {
                System.out.println(star + "%3");
            }
        }}
}
