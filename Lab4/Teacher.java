
package Lab4;

public class Teacher extends Person {

    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Display teacher details
    @Override
    public void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }
}
