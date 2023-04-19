package edu.sda.java.basics.practice;

public class OperatorsJava {
    public static void main(String[] args) {
        int first = 10;
        int second = 2;

        System.out.println("Arithmetic");
        System.out.println(first + second);
        System.out.println(first - second);
        System.out.println(first * second);
        System.out.println(first / second);
        System.out.println(first % second);

        System.out.println("Combined");
        System.out.println(first += 2);
        System.out.println(first -= 2);
        System.out.println(first *= 2);
        System.out.println(first /= 2);
        System.out.println(first %= 2);

        System.out.println("Increment");
        int increment = 3;
        System.out.println(increment);
        System.out.println(increment++);
        System.out.println(increment);
        System.out.println(++increment);

        System.out.println("Decrement");
        int decrement = 3;
        System.out.println(decrement);
        System.out.println(decrement--);
        System.out.println(decrement);
        System.out.println(--decrement);

        // comparing
        System.out.println("Compare");
                int a = 1;
                int b = 1;
                int c = 2;
                boolean check = a==c;
                System.out.println("Is a equal to b? " + (a == b));
                System.out.println("Is a equal to c? " + check);
        //logical operators
        System.out.println("Logical");
        boolean firstBool = true;
        boolean secondBool = false;
        System.out.println("Logical and: " + (firstBool && secondBool));
        System.out.println("Logical and: " + (firstBool || secondBool));
        System.out.println("Logical and: " + !firstBool);
    }
}
