
package Lab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchDemo {

    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();

        marks.add(75);
        marks.add(60);
        marks.add(90);
        marks.add(85);
        marks.add(70);

        Collections.sort(marks);

        System.out.println("Sorted marks: " + marks);

        int position = Collections.binarySearch(marks, 85);

        if (position >= 0) {
            System.out.println("Mark found at index: " + position);
        } else {
            System.out.println("Mark not found.");
        }
    }
}

