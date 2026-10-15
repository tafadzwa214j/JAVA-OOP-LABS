package Lab10;

import java.util.*;

public class StreamCountExercise {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40);

        long count = numbers.stream().count();

        System.out.println(count);
    }
}
