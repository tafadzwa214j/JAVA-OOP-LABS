
package Lab2;

public class Temperature {
    private double celsius;

    // Private constructor
    private Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Factory method for Celsius
    public static Temperature fromCelsius(double celsius) {
        return new Temperature(celsius);
    }

    // Factory method for Fahrenheit
    public static Temperature fromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return new Temperature(celsius);
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        Temperature t1 = Temperature.fromCelsius(25);
        Temperature t2 = Temperature.fromFahrenheit(98.6);

        System.out.printf("Temperature 1: %.1f Celsius%n",
                t1.getCelsius());
        System.out.printf("Temperature 2: %.1f Celsius%n",
                t2.getCelsius());
        System.out.printf("Temperature 2: %.1f Fahrenheit%n",
                t2.getFahrenheit());
    }
}
