public class Truck extends Car {

    /**
     * Additional weight on the truck
     */
    private double loadWeight;

    public Truck(String name, int fuelCapacity, double averageMileage, boolean airCondition, double loadWeight) {
        super(name, fuelCapacity, averageMileage, airCondition);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    @Override
    public double getAverageMileage() {
        double averageMileage = super.getAverageMileage();
        if (getIsAirConditionOn()) {
            averageMileage = averageMileage + 1.6;
        }
        averageMileage = averageMileage - ((getLoadWeight() / 100) * 0.5);

        return averageMileage;
    }
}
