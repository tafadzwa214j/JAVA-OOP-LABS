package Lab10;

import java.util.*;

public class StreamSortExercise {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 4, 1, 3);

        numbers.stream()
               .sorted()
               .forEach(System.out::println);
    }
}

