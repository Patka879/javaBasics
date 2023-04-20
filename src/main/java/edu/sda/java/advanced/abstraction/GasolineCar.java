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


    public GasolineCar(String vin, String fuelType) {
        /**
         * Keyword "super" refers to the base class.
         * In this case calling super(vin) refers to constructor
         */
        super(vin); // first thing we do in a subclass
        /**
         * We can set other settings related to Gasoline Car here
         */
        this.fuelType = fuelType;
    }



    /**
     * We need to prepare a code for runEngine() method
     * To mark a method as being derived from Car class,
     * we use annotation @Override
     */

}
