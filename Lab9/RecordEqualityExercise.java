package Lab9;

record Student(String name, int age) {}

public class RecordEqualityExercise {
    public static void main(String[] args) {
        Student s1 = new Student("Tafadzwa", 22);
        Student s2 = new Student("Tafadzwa", 22);
        Student s3 = new Student("Tafadzwa", 23);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
