package edu.sda.java.advanced.abstraction;

/**
 * your task is to create another class - ElectricCar and make it work and to use fillFuel method in
 * both non-abstract classes
 */

public class ElectricCar extends Car {

    public ElectricCar(String vin, int noOfKms) {
        super(vin, noOfKms);
    }

    @Override
    public void fillFuel() {
        System.out.println("Battery is full");
    }
    @Override
    public void runEngine() {
        System.out.println("Electric car is running");
    }

}
