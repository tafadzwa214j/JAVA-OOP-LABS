
package Lab4;

public class Person {

    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display person details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

