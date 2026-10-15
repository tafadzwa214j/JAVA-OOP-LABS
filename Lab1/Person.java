public class Person {

    Address address;

    public static void main(String[] args) {

        Person person = new Person();

       person.address = null;

System.out.println("City: " + person.address.city);
    }
}
