package edu.sda.java.basics.classes.planes;

public class PlaneApp {
    public static void main(String[] args) {
        Plane plane = new Plane("Airbus", "Emirates", 380);
        System.out.println(plane.planeInfo());
    }
}
