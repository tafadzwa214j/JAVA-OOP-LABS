
package Lab6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + "(" + marks + ")";
    }
}

public class StudentSortDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Tariro", 75));
        students.add(new Student("Anesu", 90));
        students.add(new Student("Blessing", 82));

        Collections.sort(students);
        System.out.println("By name: " + students);

        students.sort(
            Comparator.comparingInt((Student s) -> s.marks).reversed()
        );
        System.out.println("By marks: " + students);
    }
}


