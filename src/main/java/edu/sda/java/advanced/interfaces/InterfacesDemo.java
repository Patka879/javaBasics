package edu.sda.java.advanced.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        Drone drone = new Drone("AX");
        Bird bird = new Bird("Tweety");
        Penguin penguin = new Penguin("Lukas");

        System.out.println(drone.fly());
        System.out.println(bird.fly());
        System.out.println(penguin.fly());

        Flying drone2 = new Drone("XY");
        Flying bird2 = new Bird("Eagle");
        Flying penguin2 = new Penguin("Coco");

        System.out.println(drone2.fly());
        System.out.println(bird2.fly());
        System.out.println(penguin2.fly());


    }
}
