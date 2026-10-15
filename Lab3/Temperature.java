package Lab3;

public class Temperature {

    private double kelvin;

    public Temperature(double kelvin) {
        setKelvin(kelvin);
    }

    public void setKelvin(double kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException(
                    "Temperature cannot be below absolute zero");
        }

        this.kelvin = kelvin;
    }

    public double getKelvin() {
        return kelvin;
    }

    public double getCelsius() {
        return kelvin - 273.15;
    }

    public double getFahrenheit() {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {

        Temperature temp = new Temperature(300);

        System.out.printf("Kelvin: %.2f%n", temp.getKelvin());
        System.out.printf("Celsius: %.2f%n", temp.getCelsius());
        System.out.printf("Fahrenheit: %.2f%n", temp.getFahrenheit());

        try {
            temp.setKelvin(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }
}