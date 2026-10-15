package Lab3;

public final class ImmutablePerson {

    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Name cannot be empty");
        }

        if (age < 0) {
            throw new IllegalArgumentException(
                    "Age cannot be negative");
        }

        this.name = name.trim();
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        ImmutablePerson person =
                new ImmutablePerson("Tendai", 22);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
