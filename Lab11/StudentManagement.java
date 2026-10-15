package Lab11;

import java.util.ArrayList;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Tafadzwa");
        students.add("Farai");
        students.add("Tinashe");

        for (String student : students) {
            System.out.println(student);
        }
    }
}
