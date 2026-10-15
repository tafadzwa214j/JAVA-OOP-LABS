
package Lab4;

import java.util.ArrayList;

public class MyStack {

    private ArrayList<String> items;

    public MyStack() {
        items = new ArrayList<>();
    }

    // Add an item to the top
    public void push(String item) {
        items.add(item);
    }

    // Remove the top item
    public String pop() {
        if (items.isEmpty()) {
            return null;
        }

        return items.remove(items.size() - 1);
    }

    // Display the top item
    public String peek() {
        if (items.isEmpty()) {
            return null;
        }

        return items.get(items.size() - 1);
    }

    // Check whether the stack is empty
    public boolean isEmpty() {
        return items.isEmpty();
    }
}
