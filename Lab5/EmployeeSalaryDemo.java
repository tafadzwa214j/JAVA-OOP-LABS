
package Lab5;

class Employee {

    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {

    @Override
    double calculateSalary() {
        return 1000;
    }
}

class PartTimeEmployee extends Employee {

    @Override
    double calculateSalary() {
        return 500;
    }
}

public class EmployeeSalaryDemo {

    public static void main(String[] args) {

        Employee employee;

        employee = new FullTimeEmployee();
        System.out.println("Full-time salary: $" 
                + employee.calculateSalary());

        employee = new PartTimeEmployee();
        System.out.println("Part-time salary: $" 
                + employee.calculateSalary());
    }
}

