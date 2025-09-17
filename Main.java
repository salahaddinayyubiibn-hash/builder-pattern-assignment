public class Main {
    public static void main(String[] args) {
        Engine sport = new Engine("V8-Sport");
        Car car = new Car.Builder()
                .setSeats(2)
                .setEngine(sport)
                .enableGPS()
                .enableTripComputer()
                .build();

        System.out.println(car);
    }
}
