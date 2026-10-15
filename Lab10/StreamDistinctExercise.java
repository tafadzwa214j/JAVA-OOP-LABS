package Lab10;

import java.util.*;

public class StreamDistinctExercise {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 3, 4);

        numbers.stream()
               .distinct()
               .forEach(System.out::println);
    }
}
