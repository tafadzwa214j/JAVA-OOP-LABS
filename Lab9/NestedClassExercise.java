package Lab9;

public class NestedClassExercise {

    static class Message {
        void display() {
            System.out.println("Hello from nested class");
        }
    }

    public static void main(String[] args) {
        Message m = new Message();
        m.display();
    }
}

