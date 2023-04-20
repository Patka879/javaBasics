package edu.sda.java.advanced.abstraction;

/**
 * We use it when we don't want to extend Car, but we want to use methods in car.
 *
 * Anonymous type because WE DO NOT CREATE A SUBTYPE WITH PROPER CLASS NAME
 * We just locally create definitions  of abstract methods and create an object
 * basing on that local methods definition.
 *
 * One time action and we want to run it: that's what we use anonymous classes for.
 */
public class AnonymousClassDemo {
    public static void main(String[] args) {
        Car anonymous = new Car("hdhdhd823") {

            @Override
            public void runEngine () {
                System.out.println("No idea for the engine but go!");
            }

            @Override
            public void fillFuel () {
                System.out.println("Some random car filled");
            }
        };
        anonymous.runEngine();
        anonymous.fillFuel();
    }
}

