
package Lab4;

public class Vehicle {

    protected String brand;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;

        System.out.println("Vehicle constructor: " + brand);
    }

    public void display() {
        System.out.println("Brand: " + brand);
    }
}
