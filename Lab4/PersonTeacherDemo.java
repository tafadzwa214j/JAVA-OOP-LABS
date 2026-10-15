
package Lab4;

public class PersonTeacherDemo {

    public static void main(String[] args) {

        Student student = new Student(
            "Tafadzwa", 22, "Software Engineering"
        );

        Teacher teacher = new Teacher(
            "Mr Moyo", 40, "Java Programming"
        );

        System.out.println("--- Student Details ---");
        student.display();

        System.out.println();

        System.out.println("--- Teacher Details ---");
        teacher.display();
    }
}
