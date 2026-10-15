package Lab8;

public class BubbleSortExercise {
    static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 4, 1};
        String[] names = {"Zara", "Brian", "Anna"};

        bubbleSort(numbers);
        bubbleSort(names);

        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println(java.util.Arrays.toString(names));
    }
}
