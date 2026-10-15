
package Lab7;

// Custom checked exception
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidationDemo {

    static void validateAge(int age) throws InvalidAgeException {

        if (age < 0 || age > 120) {
            throw new InvalidAgeException(
                "Age must be between 0 and 120."
            );
        }

        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {

        try {
            validateAge(25);
            validateAge(150);

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}

