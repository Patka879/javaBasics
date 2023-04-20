package edu.sda.java.advanced.abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        GasolineCar gasolineCar = new GasolineCar("2132131344", "Diesel");
        ElectricCar electricCar = new ElectricCar("213DSDW3ED", 150);
        gasolineCar.runEngine();
        electricCar.runEngine();

        // What is possible with abstraction an override methods:

        /**
         * We do not pay attention if its gasoline car or electric car
         * In each case what we care about is if we can call runEngine and fillFuel methods
         * Each of them will have different way of refuelling, but that's no problem.
         */

        Car car1 = new ElectricCar("NFBRDB3883HD", 3838383);
        Car car2 = new GasolineCar("NDND8E38388D", "Benzine");
        Car car3 = new ElectricCar("JDHJDHDH993", 8832838);

        Car[] cars = new Car[]{car1, car2, car3};

        System.out.println("Loop over all cars");
        for (Car givenCar : cars) {
            givenCar.runEngine();
            givenCar.fillFuel();
        }

    }
}
