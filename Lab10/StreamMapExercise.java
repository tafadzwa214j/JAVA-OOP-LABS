package Lab10;

import java.util.*;

public class StreamMapExercise {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        numbers.stream()
               .map(n -> n * 2)
               .forEach(System.out::println);
    }
}
