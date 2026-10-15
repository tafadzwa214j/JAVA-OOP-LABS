
package Lab7;

public class MultipleCatchDemo {
    public static void main(String[] args) {

        try {
            int number = Integer.parseInt("abc");
            System.out.println(100 / number);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");

        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program finished.");
    }
}

