package edu.sda.java.basics;
import java.util.List;

public class Loops {
    public static void main(String[] args) {
        forLoop();
        forEachLoop();
        whileLoop();
        doWhileLoop();
    }
    public static void forLoop() {
        System.out.println("FirstLoop");
        for(int i = 0; i <10; i++) {
            System.out.println("I in iteration: " + i);
        }
        System.out.println("DecrementLoop");
        for(int i = 0; i > -10; i--) {
            System.out.println("I in iteration: " + i);
        }
    }

    private static void forEachLoop() {
        List<String> strings = List.of("Janek", "Marek", "Asia", "Renata");
            for (String element : strings) {
                System.out.print("Current is: " + element);
            }
    }

    private static void whileLoop() {
        int check = 10;
        while (check > 0) {
            System.out.println("doing sth in while loop");
            check--;
        }
        while (check > 100) {
            System.out.println("This will not execute");
            check--;
        }
    }

    private static void doWhileLoop() {
        int check = 10;
        do {
            System.out.println("Print " +  check);
            check++;
        } while (check < 20);
    }
}
