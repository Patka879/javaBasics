package edu.sda.java.advanced.abstraction2;

public class Elephant extends Animal {
    private String origin;
    public Elephant(String name, String origin) {
        super(name);
        this.origin = origin;
    }
    @Override
    public void move() {
        System.out.println("This is an elephant");
    }

    public void elephantOrigin() {
        System.out.println("Origin: " + origin);
    }
}
