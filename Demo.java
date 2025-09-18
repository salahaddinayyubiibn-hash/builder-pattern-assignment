package kz.edu.patterns.builder;

public class Demo {
    public static void main(String[] args) {
        Car sportsCar = new Car.Builder()
                .setSeats(2)
                .setEngine(new SportEngine())
                .setGPS(true)
                .setTripComputer(true)
                .build();

        System.out.println(sportsCar);
    }
}
