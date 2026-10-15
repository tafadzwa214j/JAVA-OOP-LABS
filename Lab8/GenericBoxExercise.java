
package Lab8;

class BoxExercise<T> {

    private T value;

    public BoxExercise(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericBoxExercise {

    public static void main(String[] args) {

        BoxExercise<String> name = new BoxExercise<>("Tafadzwa");
        BoxExercise<Integer> mark = new BoxExercise<>(85);

        System.out.println("Name: " + name.getValue());
        System.out.println("Mark: " + mark.getValue());

        name.setValue("Anesu");

        System.out.println("Updated name: " + name.getValue());
    }
}

