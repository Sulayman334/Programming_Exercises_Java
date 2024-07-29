package Chapter_5;

import java.util.Scanner;

public class KineticEnergy {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the objects mass");
        double mass = keyboard.nextDouble();

        System.out.println("Enter the objects velocity");
        double velocity = keyboard.nextDouble();
        double kineticEnergy = kineticEnergy(mass, velocity);
        System.out.println("Amount of Kinetic Energy: "+kineticEnergy);

    }
    public static double kineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }
}
