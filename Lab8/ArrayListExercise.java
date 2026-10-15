
package Lab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);

        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }

        int maximum = Collections.max(numbers);

        Collections.reverse(numbers);

        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + maximum);
        System.out.println("Reverse order: " + numbers);
    }
}

