package edu.sda.java.advanced.abstraction2;

/**
 * Create abstract class Animal
 * add field name to it
 * add method move() to it
 * Create subclasses of Animal: Bird, Fish, Elephant
 * set name though constructor
 * make a definition of move() in all of the classes
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void move();
}
