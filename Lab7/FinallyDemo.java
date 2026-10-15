
package Lab7;

public class FinallyDemo {

    static int testMethod() {

        try {
            System.out.println("Inside try block.");
            return 10;

        } finally {
            System.out.println("Inside finally block.");
        }
    }

    public static void main(String[] args) {

        int result = testMethod();

        System.out.println("Returned value: " + result);
    }
}


