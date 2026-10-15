package Lab9;

record Student(String name, int age) {
    @Override
    public String toString() {
        return name + " is " + age + " years old";
    }
}

public class ToStringExercise {
    public static void main(String[] args) {
        Student s = new Student("Tafadzwa", 22);
        System.out.println(s);
    }
}
