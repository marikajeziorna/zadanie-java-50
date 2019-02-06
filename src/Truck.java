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

        double result = averageMileage;
        double mileageFromLoadWeight = ((getLoadWeight() / 100) * 0.5);
        result  = result + mileageFromLoadWeight;
        if (getIsAirConditionOn()) {
          return result + 1.6;
        }
        return result;
    }
}