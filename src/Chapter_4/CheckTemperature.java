package Chapter_4;

import java.util.Scanner;

public class CheckTemperature {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the substance celsius temperature");
        double substanceTemperature = keyboard.nextDouble();

        final double MAX_TEMPERATURE = 102.5;
        while ( substanceTemperature > MAX_TEMPERATURE){
            System.out.println("Turn the thermostat down and wait for 5 minutes and turn it on again");
            System.out.println("Enter the temperature again");
            substanceTemperature=keyboard.nextDouble();
        }
        System.out.println("The temperature is acceptable! Check again in 15 minutes");

    }
}
