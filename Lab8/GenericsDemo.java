
package Lab8;

// T represents the type of data stored in the box
class Box<T> {

    private T content;

    Box(T content) {
        this.content = content;
    }

    T get() {
        return content;
    }

    void set(T content) {
        this.content = content;
    }
}

public class GenericsDemo {

    public static void main(String[] args) {

        Box<String> nameBox = new Box<>("Tafadzwa");
        Box<Integer> numberBox = new Box<>(100);

        System.out.println("Name: " + nameBox.get());
        System.out.println("Number: " + numberBox.get());

        nameBox.set("Java Student");

        System.out.println("Updated name: " + nameBox.get());
    }
}

