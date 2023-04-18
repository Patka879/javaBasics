package edu.sda.java.basics;
// we can call method with many arguments or with none of them
public class Varargs {
    public static void main(String[] args) {
        varArgsOne(1);
        System.out.println("===========");
        varArgsOne(5, 6, 7);
        System.out.println("===========");
        varArgsOne(1, 2, 3, 4, 5, 6 );
        System.out.println("===========");
        varArgsOne();
        System.out.println("===========");
        varArgsTwo("Patrycja", 30, 3,5,6,7);

    }

    private static void varArgsOne(int ... params) {
        for (int i = 0; i < params.length; i++) {
            System.out.println(" Param number " + i + " is " + params[i]);
        }
    }

    // In this case we need to define name and age params, and we can put multiple classes between 0 - many.
    private static void varArgsTwo(String name, int age, int ... classes) {
        System.out.println(name);
        System.out.println(age);
        System.out.println("Classes");
        for (int i = 0; i < classes.length; i++) {
            System.out.println(" Class number " + i + " is " + classes[i]);
        }
    }

    /**
     *
     */
}
