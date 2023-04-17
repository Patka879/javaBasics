package edu.sda.java.basics.classes.cars.tires;

public class Tire {
    private String tireName;

    public Tire(String tireName) {
        this.tireName = tireName;
    }

    public String getTireName() {
        return tireName;
    }

    public void setTireName(String tireName) {
        this.tireName = tireName;
    }
}