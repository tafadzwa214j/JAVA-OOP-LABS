package Lab11;

class Database {
    private static Database instance = new Database();

    private Database() {}

    public static Database getInstance() {
        return instance;
    }
}

public class SingletonExercise {
    public static void main(String[] args) {
        Database d1 = Database.getInstance();
        Database d2 = Database.getInstance();

        System.out.println(d1 == d2);
    }
}
