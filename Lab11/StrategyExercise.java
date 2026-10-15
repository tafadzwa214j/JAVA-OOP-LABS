package Lab11;

interface Payment {
    void pay();
}

class Cash implements Payment {
    public void pay() {
        System.out.println("Paid with cash");
    }
}

public class StrategyExercise {
    public static void main(String[] args) {
        Payment p = new Cash();
        p.pay();
    }
}
