package edu.sda.java.basics.classes.cars;
import edu.sda.java.basics.classes.cars.tires.Tire;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Car {
    private String name;
    private String model;
    private Engine engine;
    private Tire[] tires;

    private LocalDate dateOfProduction;

    public Car(String name, String model, Engine engine, Tire[] tires, LocalDate dateOfProduction) {
        this.name = name;
        this.model = model;
        this.engine = engine;
        this.tires = tires;
        this.dateOfProduction = dateOfProduction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tire[] getTires() {
        return tires;
    }

    public void setTires(Tire[] tires) {
        this.tires = tires;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(LocalDate dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public String carInfo() {
        return "Car Name: " + name + "\n" +
                "Car Model: " + model + "\n" +
                "Engine Fuel Type: " + engine.getFuelType() + "\n" +
                "Engine Capacity: " + engine.getCapacity() + "\n" +
                "Engine Year Of Production: " + engine.getDateOfProduction().format(DateTimeFormatter.ofPattern("yyyy")) + "\n" +
                "Tires: " + tires.length + "\n" +
                "Car Day Of Production: " + getDateOfProduction().format(DateTimeFormatter.ofPattern("MMM yyyy"));
    }
}

