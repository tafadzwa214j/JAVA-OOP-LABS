package Lab9;

enum Level {
    LOW(1), MEDIUM(2), HIGH(3);

    int value;

    Level(int value) {
        this.value = value;
    }
}

public class EnumFieldsExercise {
    public static void main(String[] args) {
        System.out.println(Level.HIGH.value);
    }
}
