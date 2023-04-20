package edu.sda.java.advanced.abstraction2;

public class Bird extends Animal {
    private boolean isItFlying;
    private boolean doesItMigrate;
    public Bird(String name, boolean isItFlying, boolean doesItMigrate) {
        super(name);
        this.isItFlying = isItFlying;
        this.doesItMigrate = doesItMigrate;
    }
    @Override
    public void move() {
        System.out.println("This is a bird");
    }

    public void birdInfo() {
        System.out.println("Can it fly? " + isItFlying);
        System.out.println("Does it migrate? " + doesItMigrate);
    }

}
