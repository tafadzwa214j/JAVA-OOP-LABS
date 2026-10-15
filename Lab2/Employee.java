package Lab2;



public class Employee {
    private static int nextId = 1;

    private int employeeId;
    private String name;
    private double salary;

    // Constructor 1: accepts name and salary
    public Employee(String name, double salary) {
        this.employeeId = nextId++;
        this.name = name;
        this.salary = salary;
    }

    // Constructor 2: accepts name only
    public Employee(String name) {
        this(name, 0.0);
    }

    // Constructor 3: no arguments
    public Employee() {
        this("Unknown", 0.0);
    }

    // Copy constructor
    public Employee(Employee other) {
        this(other.name, other.salary);
    }

    public void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Tendai", 800.0);
        Employee e2 = new Employee("Rudo");
        Employee e3 = new Employee();
        Employee e4 = new Employee(e1);

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}
