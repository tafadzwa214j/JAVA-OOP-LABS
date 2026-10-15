
package Lab8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Tafadzwa", 75));
        students.add(new Student("Anesu", 90));
        students.add(new Student("Blessing", 65));

        System.out.println("Before sorting: " + students);

        students.sort(Comparator.comparingInt(
            (Student s) -> s.marks
        ).reversed());

        System.out.println("Sorted by marks: " + students);
    }
}

