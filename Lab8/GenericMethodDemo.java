
package Lab8;

public class GenericMethodDemo {

    // T allows this method to work with different data types
    public static <T> void display(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {

        display("Hello Java");
        display(100);
        display(25.5);
        display(true);
    }
}

