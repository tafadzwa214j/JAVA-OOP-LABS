package Lab10;

import java.util.*;

public class StreamUppercaseExercise {
    public static void main(String[] args) {
        List<String> names = List.of("tafadzwa", "farai", "tinashe");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
