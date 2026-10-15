
package Lab6;

interface Printable {
    void print();
}

class Student implements Printable {
    @Override
    public void print() {
        System.out.println("Printing student details");
    }
}

class Report implements Printable {
    @Override
    public void print() {
        System.out.println("Printing report");
    }
}

public class PrintableDemo {
    public static void main(String[] args) {
        Printable[] items = {
            new Student(),
            new Report()
        };

        for (Printable item : items) {
            item.print();
        }
    }
}

