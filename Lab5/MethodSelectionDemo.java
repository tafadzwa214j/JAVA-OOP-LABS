
package Lab5;

class Vehicle {

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car engine is starting");
    }
}

class Motorcycle extends Vehicle {

    @Override
    void start() {
        System.out.println("Motorcycle engine is starting");
    }
}

public class MethodSelectionDemo {

    public static void main(String[] args) {

        Vehicle vehicle;

        vehicle = new Car();
        vehicle.start();

        vehicle = new Motorcycle();
        vehicle.start();

        vehicle = new Vehicle();
        vehicle.start();
    }
}
