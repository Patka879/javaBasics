package edu.sda.java.basics.classes.cars;
import edu.sda.java.basics.classes.cars.tires.Tire;
import java.time.LocalDate;


public class CarsApp {
    public static void main(String[] args) {
        LocalDate engineDateOfProduction = LocalDate.of(2022, 3, 15);
        LocalDate carDateOfProduction = LocalDate.of(2021, 6, 20);

        Engine engine = new Engine("Diesel", 2000, engineDateOfProduction);
        Tire[] tires = {new Tire("Front left"), new Tire("Front right"), new Tire("Rear left"), new Tire("Rear right")};

        Car car = new Car("Toyota", "Corolla", engine, tires, carDateOfProduction);
        System.out.println(car.carInfo());
    }
}