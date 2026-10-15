package Lab10;

import java.util.*;

public class StreamSumExercise {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                         .mapToInt(n -> n)
                         .sum();

        System.out.println(sum);
    }
}
