
package Lab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StudentMark implements Comparable<StudentMark> {

    String name;
    int marks;

    StudentMark(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(StudentMark other) {
        return Integer.compare(this.marks, other.marks);
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class ComparableDemo {

    public static void main(String[] args) {

        List<StudentMark> students = new ArrayList<>();

        students.add(new StudentMark("Tafadzwa", 85));
        students.add(new StudentMark("Anesu", 70));
        students.add(new StudentMark("Blessing", 90));

        Collections.sort(students);

        System.out.println("Students sorted by marks:");
        for (StudentMark student : students) {
            System.out.println(student);
        }
    }
}

