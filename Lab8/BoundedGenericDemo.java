
package Lab8;

class NumberBox<T extends Number> {

    private T value;

    NumberBox(T value) {
        this.value = value;
    }

    double getDoubleValue() {
        return value.doubleValue();
    }
}

public class BoundedGenericDemo {

    public static void main(String[] args) {

        NumberBox<Integer> wholeNumber = new NumberBox<>(100);
        NumberBox<Double> decimalNumber = new NumberBox<>(25.5);

        System.out.println("Integer value: " +
            wholeNumber.getDoubleValue());

        System.out.println("Double value: " +
            decimalNumber.getDoubleValue());
    }
}

