
package Lab7;

public class ArrayExceptionDemo {

    static void displayElement(int[] numbers, int index) {
        try {
            System.out.println("Value: " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index does not exist.");
        }
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        displayElement(numbers, 1);
        displayElement(numbers, 5);

        System.out.println("Program continues...");
    }
}

