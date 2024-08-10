package Chapter_6;

import java.util.Scanner;

public class TemperatureClassTest {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double temperatureInFahrenheit = keyboard.nextDouble();

        TemperatureClass temp = new TemperatureClass(temperatureInFahrenheit);
        System.out.println("Celsius: " + temp.getCelsius());
        System.out.println("Kelvin: " + temp.getKelvin());

    }
}
