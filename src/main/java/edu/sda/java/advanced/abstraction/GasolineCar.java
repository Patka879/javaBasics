package edu.sda.java.advanced.abstraction;

/**
 * This is class that takes general idea of Car and adds some special
 * setting typical for the gasoline car
 * Keyword "extends" to cennect it to general class. Id indicates that we treat GasolineCar
 * as a subtype of a car.
 */
public class GasolineCar extends Car {

    private String fuelType;
    /**
     * As we have a constructor in Car class
     * we need to add one here and pass values to
     * Car(String vin)
     */


    public GasolineCar(String vin, String fuelType, int noOfKms) {
        /**
         * Keyword "super" refers to the base class.
         * In this case calling super(vin) refers to constructor
         */
        super(vin, noOfKms); // first thing we do in a subclass, refers to the first constructor in Car
        /**
         * We can set other settings related to Gasoline Car here
         */
        this.fuelType = fuelType;
    }


    public GasolineCar(String vin, String fuelType) {
        super(vin); //refers to second constructor in Car
        this.fuelType = fuelType;
    }
    /**
     * We need to prepare a code for runEngine() method
     * To mark a method as being derived from Car class,
     * we use annotation @Override
     *
     * Override annotation is an information that for this class
     * we will use this definition of method instead of general one.
     *
     * Overriding requires keeping some:
     * - number and type of parameters,
     * - method name
     * - return type
     *
     * As for the access (public, protected, package-private) we have to keep the same
     * access level or add a wider override:
     * - package private abstract -> package private (ok)
     * - package public abstract -> package public (ok)
     * - public -> protected (not ok, as public is wider than protected)
     */
    @Override
    public void runEngine() {
        System.out.println("Engine is running");
    }
    @Override
    public void fillFuel() {
        System.out.println("Fuel is full");
    }

}
