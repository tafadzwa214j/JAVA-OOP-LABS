package Lab10;

public class LambdaExercise {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello Java");
        r.run();
    }
}
