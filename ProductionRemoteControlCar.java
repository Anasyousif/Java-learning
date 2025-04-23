public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceTravelled;
    private int numberOfVictories;

    public ProductionRemoteControlCar() {
        this.distanceTravelled = 0;
        this.numberOfVictories = 0;
    }

    @Override
    public void drive() {
        System.out.println("Driving the Production Car...");
        this.distanceTravelled += 10; // Increment by 10 meters
    }

    @Override
    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar otherCar) {
        // Sort by number of victories in descending order
        return Integer.compare(otherCar.getNumberOfVictories(), this.getNumberOfVictories());
    }
}
