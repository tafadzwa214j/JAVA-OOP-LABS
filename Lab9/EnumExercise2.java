
package Lab9;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY;

    void display() {
        System.out.println("Today is " + this);
    }
}

public class EnumExercise2 {
    public static void main(String[] args) {
        Day today = Day.TUESDAY;
        today.display();
    }
}

