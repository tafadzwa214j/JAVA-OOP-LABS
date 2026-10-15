
package Lab7;

import java.util.Scanner;

public class DivisionExercise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int num1 = input.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = input.nextInt();

            int result = num1 / num2;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter integers only.");

        } finally {
            input.close();
            System.out.println("Program ended.");
        }
    }
}

