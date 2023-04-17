package edu.sda.java.basics.classes.cars;
import edu.sda.java.basics.classes.cars.tires.Tire;
public class CarsApp {
    public static void main(String[] args) {
        Engine engine = new Engine("Diesel", 2000);
        Tire[] tires = {new Tire("Front left"), new Tire("Front right"), new Tire("Rear left"), new Tire("Rear right")};
        Car car = new Car("Toyota", "Corolla", engine, tires);
        System.out.println(car.carInfo());
    }
}