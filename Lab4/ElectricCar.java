
package Lab4;

public class ElectricCar extends Car {

    private int batteryCapacity;

    // Constructor
    public ElectricCar(String brand, int doors, int batteryCapacity) {
        super(brand, doors);
        this.batteryCapacity = batteryCapacity;

        System.out.println("ElectricCar constructor: " + brand);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Battery capacity: " + batteryCapacity + " kWh");
    }
}

