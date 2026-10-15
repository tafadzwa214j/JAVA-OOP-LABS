
package Lab4;

public class Manager extends Employee {

    private double bonus;

    // Constructor
    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;

        System.out.println("Manager constructor: " + name);
    }

    // Calculate salary including bonus
    @Override
    public double calculatePay() {
        return super.calculatePay() + bonus;
    }
}
