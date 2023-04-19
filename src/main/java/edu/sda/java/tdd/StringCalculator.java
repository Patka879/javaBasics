package edu.sda.java.tdd;

public class StringCalculator {
    public int sum(String argument) {

        if (argument.equals("")) {
            return 0;
        }
        return Integer.parseInt(argument);

    }
}
