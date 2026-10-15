package Lab9;

public class LocalClassExercise {
    public static void main(String[] args) {

        class Greeting {
            void display() {
                System.out.println("Hello Java");
            }
        }

        Greeting g = new Greeting();
        g.display();
    }
}
