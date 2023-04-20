package edu.sda.java.advanced.abstraction2;

public class Fish extends Animal {
    private String type;

    public Fish(String name, String type) {
        super(name);
        this.type = type;
    }
    @Override
    public void move() {
        System.out.println("This is a fish");
    }

    public void fishType() {
        System.out.println("Type: " + type);
    }
}
