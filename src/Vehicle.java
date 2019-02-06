public class Vehicle {

    /**
     * Vehicle name
     */
    protected String name;

    /**
     * Fuel Capacity f.g 35l
     */
    protected int fuelCapacity;

    /**
     * Average Mileage f.g 5.5l/100km
     */
    protected final double averageMileage;

    public Vehicle(String name, int fuelCapacity, double averageMileage) {
        this.name = name;
        this.fuelCapacity = fuelCapacity;
        this.averageMileage = averageMileage;
    }

    public String getName() {
        return name;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public double getAverageMileage() {
        return averageMileage;
    }

    void showInfo() {
        System.out.printf("\nVehicle name: " + getName() + ", " + " fuel capacity: " + getFuelCapacity() + ", " + " average mileage: " + getAverageMileage() + ", " + " vehicle distance: %.2f", getVehicleDistance());
    }

    public double getVehicleDistance() {
        double vehicleDistance = getFuelCapacity() * 100 / getAverageMileage();
        return vehicleDistance;
    }
}