
package Lab8;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Tafadzwa");
        students.add("Anesu");
        students.add("Blessing");

        System.out.println("Students: " + students);

        System.out.println("First student: " + students.get(0));

        students.remove("Anesu");

        System.out.println("After removal: " + students);

        System.out.println("Number of students: " + students.size());
    }
}

