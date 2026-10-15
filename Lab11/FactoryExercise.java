package Lab11;

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}

class AnimalFactory {
    static Animal create() {
        return new Dog();
    }
}

public class FactoryExercise {
    public static void main(String[] args) {
        Animal a = AnimalFactory.create();
        a.sound();
    }
}
