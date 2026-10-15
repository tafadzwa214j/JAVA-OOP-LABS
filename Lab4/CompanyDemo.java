
package Lab4;

public class CompanyDemo {

    public static void main(String[] args) {

        Employee employee = new Employee("Kudzai", 2000);

        Manager manager = new Manager("Nyasha", 3500, 800);

        Developer developer = new Developer("Tatenda", 3000, 10);

        System.out.println("----");

        employee.describe();
        manager.describe();
        developer.describe();
    }
}
