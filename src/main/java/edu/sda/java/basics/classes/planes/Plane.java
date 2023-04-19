package edu.sda.java.basics.classes.planes;
import edu.sda.java.basics.classes.planes.inner.Capacity;

public class Plane {
    private String name;
    private String airline;
    private int type;
    private Capacity capacity;

    public Plane(String name, String airline, int type, Capacity capacity) {
        this.name = name;
        this.airline = airline;
        this.type = type;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAirline() {
        return airline;
    }
    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getType() {
        return type;
    }
    public void setType() {
        this.type = type;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public String planeInfo() {
        return "Plane Name: " + name + "\n" +
                "Type: " + type + "\n" +
                "Airline: " + airline + "\n" +
                "Capacity: " + "\n" +
                "Economy class " + capacity.getEconomy() + "\n" +
                "Business class " + capacity.getBusiness() + "\n" +
                "First class " + capacity.getFirst();
    }
}
