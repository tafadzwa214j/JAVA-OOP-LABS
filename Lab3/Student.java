package Lab3;

public class Student {

    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        setMarks(marks);
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
    public String getGrade() {
    if (marks >= 80) {
        return "A";
    } else if (marks >= 70) {
        return "B";
    } else if (marks >= 50) {
        return "C";
    } else {
        return "F";
    }
}

    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException(
                    "Marks must be between 0 and 100");
        }

        this.marks = marks;
    }

    public static void main(String[] args) {
        Student student = new Student("Tendai", 85);

        System.out.println("Name: " + student.getName());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Grade: " + student.getGrade());

        try {
            student.setMarks(120);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }
}