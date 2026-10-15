
package Lab4;

public class Developer extends Employee {

    private int overtimeHours;

    private static final double OVERTIME_RATE = 25.0;

    // Constructor
    public Developer(String name, double baseSalary, int overtimeHours) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    // Calculate salary including overtime
    @Override
    public double calculatePay() {
        return baseSalary + (overtimeHours * OVERTIME_RATE);
    }
}
