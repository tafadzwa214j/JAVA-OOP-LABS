package Lab8;
import java.util.ArrayList;

class GenericStack<T> {
    ArrayList<T> items = new ArrayList<>();

    void push(T item) {
        items.add(item);
    }

    T pop() {
        return items.remove(items.size() - 1);
    }

    T peek() {
        return items.get(items.size() - 1);
    }

    boolean isEmpty() {
        return items.isEmpty();
    }
}

public class GenericStackExercise {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();

        stack.push("Java");
        stack.push("Python");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
