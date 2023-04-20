package edu.sda.java.advanced.abstraction;

/**
 * Abstract Class = cannot be instanitaized
 * which means we cannot make an objet directly from this clas
 *
 * Abstract class is "generale description of some type"
 * i.e. Animal and then special classes: Bird, Fish
 */
public abstract class Car {
    private String vin;

    public Car(String vin) {
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    public abstract void runEngine();

}
