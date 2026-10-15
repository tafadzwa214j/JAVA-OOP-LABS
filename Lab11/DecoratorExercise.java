package Lab11;

interface Message {
    String getText();
}

class SimpleMessage implements Message {
    public String getText() {
        return "Hello";
    }
}

public class DecoratorExercise {
    public static void main(String[] args) {
        Message m = new SimpleMessage();
        System.out.println(m.getText() + " Java");
    }
}
