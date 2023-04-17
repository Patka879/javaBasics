package edu.sda.java.basics.classes.planes;

public class Plane {
    private String name;
    private String airline;
    private int type;

    public Plane(String name, String airline, int type) {
        this.name = name;
        this.airline = airline;
        this.type = type;
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

    public String planeInfo() {
        return "Plane Name: " + name + "\n" +  "Type: " + type + "\n" +  "Airline: " + airline;
    }
}
