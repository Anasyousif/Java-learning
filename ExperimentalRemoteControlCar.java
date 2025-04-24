public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int distanceTravelled;
    public ExperimentalRemoteControlCar() {
        this.distanceTravelled = 0;
    }
    @Override
    public void drive() {
        // Experimental car drives 20 meters per call (to create the difference)
        System.out.println("Driving the Experimental Car...");
        this.distanceTravelled += 20; // Increment by 20 meters
    }
    @Override
    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }
    public void setDistanceTravelled(int distance) {
        this.distanceTravelled = distance; // Reset distance if needed for tests
    }
}
