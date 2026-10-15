
package Lab8;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class GenericPairExercise {
    public static void main(String[] args) {
        Pair<String, Integer> student =
                new Pair<>("Tafadzwa", 85);

        System.out.println("Student name: " + student.getKey());
        System.out.println("Student mark: " + student.getValue());
    }
}

