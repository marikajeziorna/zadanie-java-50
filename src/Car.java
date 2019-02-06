public class Car extends Vehicle {

    /**
     * Air condition is ON
     */
    protected boolean isAirConditionOn;

    public Car(String name, int fuelCapacity, double averageMileage, boolean airConditionOn) {
        super(name, fuelCapacity, averageMileage);
        this.isAirConditionOn = airConditionOn;
    }

    public boolean getIsAirConditionOn() {
        return isAirConditionOn;
    }

    public void setIsAirConditionOn(boolean isAirConditionOn) {
        this.isAirConditionOn = isAirConditionOn;
    }

    @Override
    public double getAverageMileage() {
        if (getIsAirConditionOn()) {
            return averageMileage + 0.8;
        }
        return averageMileage;
    }
}
