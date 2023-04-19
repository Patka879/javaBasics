package edu.sda.java.basics.classes.planes;

import edu.sda.java.basics.classes.planes.inner.Capacity;

public class PlaneApp {
    public static void main(String[] args) {
        Capacity capacity = new Capacity(234, 120,26);
        Plane plane = new Plane("Airbus", "Emirates", 380, capacity);
        System.out.println(plane.planeInfo());
    }
}
