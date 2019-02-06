public class TestClass {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car("Volvo", 34, 5.5, false);
        cars[1] = new Truck("Star", 60, 7.0, false, 500);

        System.out.println("Vehicles with air condition OFF:");
        for (Car car : cars) {
            if (car != null) {
                car.showInfo();
            }
        }
        System.out.println("\n");

        System.out.println("Vehicles with air condition ON: ");
        for (Car car : cars) {
            if (car != null) {
                car.setIsAirConditionOn(true);
                car.showInfo();
            }
        }
    }
}