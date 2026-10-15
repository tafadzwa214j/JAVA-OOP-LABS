package Lab9;

public class InnerClassExercise {
    class Message {
        void display() {
            System.out.println("Hello from inner class");
        }
    }

    public static void main(String[] args) {
        InnerClassExercise outer = new InnerClassExercise();
        InnerClassExercise.Message inner = outer.new Message();
        inner.display();
    }
}
