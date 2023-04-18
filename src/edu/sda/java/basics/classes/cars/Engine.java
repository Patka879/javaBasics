package edu.sda.java.basics.classes.cars;

import java.time.LocalDate;

public class Engine {
    private String fuelType;
    private int capacity;
    private LocalDate dateOfProduction;

    public Engine(String fuelType, int capacity, LocalDate dateOfProduction) {
        this.fuelType = fuelType;
        this.capacity = capacity;
        this.dateOfProduction = dateOfProduction;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(LocalDate dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }
}
