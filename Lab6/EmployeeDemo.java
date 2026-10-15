
package Lab6;

interface Workable {
    void work();
}

abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee implements Workable {
    FullTimeEmployee(String name) {
        super(name);
    }

    @Override
    double calculateSalary() {
        return 800;
    }

    @Override
    public void work() {
        System.out.println(name + " is working full-time.");
    }
}

class PartTimeEmployee extends Employee implements Workable {
    PartTimeEmployee(String name) {
        super(name);
    }

    @Override
    double calculateSalary() {
        return 300;
    }

    @Override
    public void work() {
        System.out.println(name + " is working part-time.");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee("Tariro"),
            new PartTimeEmployee("Tendai")
        };

        for (Employee employee : employees) {
            System.out.println(
                employee.name + " salary: $" + employee.calculateSalary()
            );

            ((Workable) employee).work();
        }
    }
}

