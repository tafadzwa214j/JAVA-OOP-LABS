package Lab11;

interface Observer {
    void update();
}

class Student implements Observer {
    public void update() {
        System.out.println("Student notified");
    }
}

public class ObserverExercise {
    public static void main(String[] args) {
        Observer s = new Student();
        s.update();
    }
}
