
package Lab6;

interface FirstGreeting {
    default void hello() {
        System.out.println("Hello from FirstGreeting");
    }
}

interface SecondGreeting {
    default void hello() {
        System.out.println("Hello from SecondGreeting");
    }
}

class Greeting implements FirstGreeting, SecondGreeting {

    @Override
    public void hello() {
        FirstGreeting.super.hello();
        SecondGreeting.super.hello();
        System.out.println("Hello from Greeting");
    }
}

public class DefaultMethodDemo {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.hello();
    }
}

