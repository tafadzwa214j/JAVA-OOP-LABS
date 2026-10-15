package Lab9;

record Student(String name, int age) {}

public class HashCodeExercise {
    public static void main(String[] args) {
        Student s1 = new Student("Tafadzwa", 22);
        Student s2 = new Student("Tafadzwa", 22);

        System.out.println(s1.hashCode() == s2.hashCode());
    }
}
