
package Lab2;

public class Circle {
    private double radius;
    private static int count = 0;

    // Constructor that accepts a radius
    public Circle(double radius) {
        this.radius = radius;
        count++;
    }

    // No-argument constructor
    public Circle() {
        this(1.0);
    }

    public double getRadius() {
        return radius;
    }

    // Static getter for the counter
    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle();
        Circle c3 = new Circle(3.0);

        System.out.println("Circle 1 radius: " + c1.getRadius());
        System.out.println("Circle 2 radius: " + c2.getRadius());
        System.out.println("Circle 3 radius: " + c3.getRadius());

        System.out.println("Total circles: " + Circle.getCount());
    }
}

