package Lab9;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

public class EnumLoopExercise {
    public static void main(String[] args) {
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
