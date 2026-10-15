package Lab10;

import java.util.*;

public class StreamExercise {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        numbers.stream()
               .filter(n -> n > 3)
               .forEach(System.out::println);
    }
}
