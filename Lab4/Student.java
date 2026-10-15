
package Lab4;

public class Student extends Person {

    private String course;

    // Constructor
    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    // Display student details
    @Override
    public void display() {
        super.display();
        System.out.println("Course: " + course);
    }
}
