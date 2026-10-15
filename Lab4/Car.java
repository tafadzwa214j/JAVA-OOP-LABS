
package Lab4;

public class Car extends Vehicle {

    protected int doors;

    // Constructor
    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;

        System.out.println("Car constructor: " + brand);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Doors: " + doors);
    }
}

