
package Lab8;

class NumberBox<T extends Number> {
    private T value;

    public NumberBox(T value) {
        this.value = value;
    }

    public double getDoubleValue() {
        return value.doubleValue();
    }
}

public class BoundedGenericExercise {
    public static void main(String[] args) {
        NumberBox<Integer> first = new NumberBox<>(100);
        NumberBox<Double> second = new NumberBox<>(25.5);

        System.out.println("Integer value: " + first.getDoubleValue());
        System.out.println("Double value: " + second.getDoubleValue());
    }
}

