
package Lab4;

public class VehicleDemo {

    public static void main(String[] args) {

        ElectricCar car = new ElectricCar(
            "Tesla", 4, 75
        );

        System.out.println("----");
        car.display();
    }
}
