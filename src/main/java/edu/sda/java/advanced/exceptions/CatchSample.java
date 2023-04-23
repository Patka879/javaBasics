package edu.sda.java.advanced.exceptions;

import java.io.*;
import java.util.Scanner;

/**
 * Exceptions are sth that might happen but it doesn't have to happen.
 */
public class CatchSample {
    public static void main(String[] args)  {
         catchAndSolve();
        /**
         * We might get exception from "passException" and there are 2 possibilities of what we can do:
         * - we surround that method call with "try - catch" block
         * - we pass the execution further with "throws" clause on yet another method.
         */
        try {
            passException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        catchAndSolveFinale();
//        npDemo();

    }

    /**
     * Deprecated as there's another method with better exception solving
     * and stream closing.
     * Use tryWithResources instead
     */
    @Deprecated
    private static void catchAndSolve() {

        try {
            FileWriter writer = new FileWriter("sampleFile.txt");
            writer.write("Sample line in a file");
            writer.close(); // close the connection to stream

        } catch (IOException ex) {
            System.out.println("Something exceptional hapenned");
            // here we solve whatever happened - in a way we want
            System.out.println(ex.getCause());
        }
    }

    private static void passException() throws IOException {
        FileReader reader = new FileReader(".gitignore");
        Scanner scanner = new Scanner(reader);
        System.out.println(scanner.nextLine());
        scanner.close();
        reader.close();
        /**
         * This time I don't want to solve expection here, I rather
         * "pass it up" the ladder
         */
    }

    private static void catchAndSolveFinale() {
        try {
            System.out.println("Sout from try block - start");
            FileReader reader = new FileReader(".gitignore" );
            System.out.println("Sout from try block -end");
        } catch (FileNotFoundException e) {
            System.out.println("Sout from exception");
            throw new RuntimeException(e);
        } finally {
            System.out.println("THIS will be executed in both cases");
            System.out.println("-PROGRAM WILL RUN AN EXCEPTION");
            System.out.println("-PROGRAM WILL RUN ALL GOOD");
            }
        }

        private static void tryWithResources() {
            tryWithResources();

            try(FileWriter writer = new FileWriter("gitignore-copy")) {
                writer.write("copy of gitignore");
                /**
                 * This construction: try with resources
                 * allows us to not take care about closing the stream
                 * ONLY if stream implements Closeable or AutoCloseable interfaces
                 */
            } catch(IOException e) {
                System.out.println(e.getCause());
            }
        }

    private static String npDemo() { //null pointer exception, exception that is not checked
        /**
         * The code will produce NullPointerException - or NPE
         * And Java does not force me to solve it by tr-catch
         * It's because NPE is not a checked exception, we do not
         * need to solve it, rather fix the code so that it does not happen at all.
         */
        String cause = null;
        System.out.println(cause.toUpperCase());
        return cause;
    }
}
