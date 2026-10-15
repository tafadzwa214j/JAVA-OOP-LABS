package Lab10;

import java.nio.file.*;

public class AppendExercise {
    public static void main(String[] args) throws Exception {
        Path file = Path.of("students.txt");

        Files.writeString(file, "Farai\n",
                StandardOpenOption.APPEND);

        System.out.println(Files.readString(file));
    }
}
