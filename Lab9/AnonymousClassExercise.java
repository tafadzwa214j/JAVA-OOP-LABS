package Lab9;

public class AnonymousClassExercise {
    public static void main(String[] args) {

        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Running");
            }
        };

        r.run();
    }
}
