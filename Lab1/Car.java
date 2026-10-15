public class Car {

    String brand;
    int year;
    double mileage;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
    }
    boolean isAntique() {
    return 2026 - year > 25;
}

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.year = 2020;
        car1.mileage = 45000;
        car1.display();
System.out.println("Antique? " + car1.isAntique());

        Car car2 = new Car();
        car2.brand = "BMW";
        car2.year = 2022;
        car2.mileage = 30000;
        car2.display();
        System.out.println("Antique? " + car2.isAntique());

        Car car3 = new Car();
        car3.brand = "Honda";
        car3.year = 2019;
        car3.mileage = 60000;
        car3.display();
        System.out.println("Antique? " + car3.isAntique());
    }
}