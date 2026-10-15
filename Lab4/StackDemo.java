
package Lab4;

public class StackDemo {

    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push("Book");
        stack.push("Pen");
        stack.push("Laptop");

        System.out.println("Top item: " + stack.peek());

        System.out.println("Removed: " + stack.pop());

        System.out.println("New top item: " + stack.peek());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

