
package Lab5;

public class OverloadingDemo {

    // Accept an integer
    static void print(int value) {
        System.out.println("Integer: " + value);
    }

    // Accept a decimal number
    static void print(double value) {
        System.out.println("Double: " + value);
    }

    // Accept text
    static void print(String value) {
        System.out.println("String: " + value);
    }

    // Accept an array of integers
    static void print(int[] values) {
        System.out.print("Array: ");

        for (int value : values) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        print(10);
        print(5.5);
        print("Hello Java");
        print(new int[]{1, 2, 3});
    }
}
