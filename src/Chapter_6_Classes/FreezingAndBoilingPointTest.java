package Chapter_6_Classes;

import java.util.Scanner;

public class FreezingAndBoilingPointTest {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the temperature");
        double temperature = keyboard.nextDouble();

        FreezingAndBoilingPoint test = new FreezingAndBoilingPoint(temperature);
        System.out.println(test.isEthyFreezing());
    }
}
