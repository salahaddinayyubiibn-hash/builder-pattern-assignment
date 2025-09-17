public final class Car {
    private final int seats;
    private final Engine engine;
    private final boolean hasGPS;
    private final boolean hasTripComputer;

    private Car(Builder builder) {
        this.seats = builder.seats;
        this.engine = builder.engine;
        this.hasGPS = builder.hasGPS;
        this.hasTripComputer = builder.hasTripComputer;
    }

    public int getSeats() { return seats; }
    public Engine getEngine() { return engine; }
    public boolean hasGPS() { return hasGPS; }
    public boolean hasTripComputer() { return hasTripComputer; }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine=" + engine +
                ", hasGPS=" + hasGPS +
                ", hasTripComputer=" + hasTripComputer +
                '}';
    }

    public static class Builder {
        private int seats = 4;
        private Engine engine; // required
        private boolean hasGPS = false;
        private boolean hasTripComputer = false;

        public Builder setSeats(int seats) {
            if (seats <= 0) throw new IllegalArgumentException("seats must be > 0");
            this.seats = seats;
            return this;
        }

        public Builder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder enableGPS() {
            this.hasGPS = true;
            return this;
        }

        public Builder disableGPS() {
            this.hasGPS = false;
            return this;
        }

        public Builder enableTripComputer() {
            this.hasTripComputer = true;
            return this;
        }

        public Builder disableTripComputer() {
            this.hasTripComputer = false;
            return this;
        }

        public Car build() {
            validate();
            return new Car(this);
        }

        private void validate() {
            if (engine == null) throw new IllegalStateException("Engine is required");
            if (seats < 1) throw new IllegalStateException("seats must be >= 1");
        }
    }
}
