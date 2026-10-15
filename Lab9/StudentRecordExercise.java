package Lab9;

record Student(String name, int age) {}

public class StudentRecordExercise {
    public static void main(String[] args) {
        Student s = new Student("Tafadzwa", 22);

        System.out.println(s.name());
        System.out.println(s.age());
        System.out.println(s);
    }
}
