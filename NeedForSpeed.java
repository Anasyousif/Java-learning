class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int batteryLevel;
    private int distanceDriven;

    // Constructor
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.batteryLevel = 100;
        this.distanceDriven = 0;
    }

    // Check if battery is drained
    public boolean batteryDrained() {
        return batteryLevel < batteryDrain;
    }

    // Get distance driven
    public int distanceDriven() {
        return distanceDriven;
    }

    // Simulate driving the car
    public void drive() {
        if (!batteryDrained()) {
            batteryLevel -= batteryDrain;
            distanceDriven += speed;
        }
    }

    // Static method to create a nitro car
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    // Constructor
    RaceTrack(int distance) {
        this.distance = distance;
    }

    // Check if the car can finish the race
    public boolean canFinishRace(NeedForSpeed car) {
        // Keep driving until the battery can't support another drive
        while (!car.batteryDrained()) {
            car.drive();
        }

        return car.distanceDriven() >= distance;
    }
}
