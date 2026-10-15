package Lab4;

public class Employee {

    private final String name;
    protected double baseSalary;

    // Constructor
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;

        System.out.println("Employee constructor: " + name);
    }

    // Getter
    public String getName() {
        return name;
    }

    // Calculate basic pay
    public double calculatePay() {
        return baseSalary;
    }

    // Display employee details
    public void describe() {
        System.out.printf("%s earns %.2f%n",
                name, calculatePay());
    }
}
