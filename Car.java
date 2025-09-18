package kz.edu.patterns.builder;

public class Car {
    private final int seats;
    private final Engine engine;
    private final boolean hasGPS;
    private final boolean hasTripComputer;

    private Car(int seats, Engine engine, boolean gps, boolean tripComp) {
        this.seats = seats;
        this.engine = engine;
        this.hasGPS = gps;
        this.hasTripComputer = tripComp;
    }

    public static class Builder {
        private int seats;
        private Engine engine;
        private boolean hasGPS;
        private boolean hasTripComputer;

        public Builder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder setGPS(boolean gps) {
            this.hasGPS = gps;
            return this;
        }

        public Builder setTripComputer(boolean tripComp) {
            this.hasTripComputer = tripComp;
            return this;
        }

        public Car build() {
            return new Car(seats, engine, hasGPS, hasTripComputer);
        }
    }
}
