package edu.sda.java.basics;

public class Methods {
    // method that does not return anything, not accept any arguments

    void someCall() {
        System.out.println("No args passed, nothing is returned");
    }

    //method that does not return anything, accepts two arguments
    void sum(int a, int b) {
        System.out.print(a + b);
    }

    // method that returns sth but doesn't accept any arguments
    int random() {
        return 7;
    }

    // method that returns sth and accepts arguments
    int addAndReturn(int a, int b) {
       return a + b;
    }

    // return in this method is used to break the execution of given condition
    void doNothing(int arg) {
        if(arg == 2) {
            return;
        } else {
            System.out.println(arg);
        }
    }
}
