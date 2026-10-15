package Lab10;

import java.nio.file.*;
import java.io.IOException;

public class FileExercise {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("students.txt");

        Files.writeString(file, "Tafadzwa\n");
        System.out.println(Files.readString(file));
    }
}
