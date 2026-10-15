
package Lab6;

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird flies by flapping its wings.");
    }
}

class Aeroplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Aeroplane flies using its engines.");
    }
}

public class FlyableDemo {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {
            new Bird(),
            new Aeroplane()
        };

        for (Flyable object : flyingObjects) {
            object.fly();
        }
    }
}

