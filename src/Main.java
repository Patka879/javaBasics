
public class Main {

    private static int privateSample = 1000; // visible only within the same class
    int packageProtectedSample; // visible in this class and all the classes in the same package
    protected int protectedSample; // visible for this class and classes that EXTEND this class
    public int publicSample; // visible everywhere

    public static void main(String[] args) {
        int privateSample = 200; // narrowed context, it will be used
        System.out.println("Hello and welcome!");
        System.out.println("Use variable " + privateSample);
        anotherMethod();
    }

    public static void anotherMethod() {
        System.out.println("Original variable value " + privateSample);
    }
}