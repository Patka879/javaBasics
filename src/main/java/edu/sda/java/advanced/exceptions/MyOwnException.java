package edu.sda.java.advanced.exceptions;

public class MyOwnException extends IllegalArgumentException {
    public MyOwnException() {
        /**
         * this constructor uses non-argument constructor from Illegal Argument Exception
         * Even though we do not see that, there is a call
         */
        System.out.println("No-arg constructor used");
    }
    public MyOwnException(String s) {
        super(s);
        System.out.println("One-argument constructor used");
    }
}
