package Chapter_7;

import java.util.Scanner;

public class RainFall {

    public static void main(String[] args) {


        final int MONTHS = 12;
        int[] amountOfRainfall = new int[MONTHS];


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount of rainfall from month 1 to 12");
        int totalRainfall;


        for (int i = 0; i < amountOfRainfall.length; i++) {
            System.out.println("Enter month " + (i + 1));
            amountOfRainfall[i] = keyboard.nextInt();


        }
        totalRainfall = (int) totalRainfall(amountOfRainfall);
        System.out.println(totalRainfall);
        double average = (double) totalRainfall / (double) MONTHS;
        System.out.println(average);
        int highestRainfallMonth = highestRainfallMonth(amountOfRainfall);
        System.out.println("Highest Rainfall Month: " + highestRainfallMonth);
        int lowestRainfallMonth = lowestRainfallMonth(amountOfRainfall);
        System.out.println("Lowest Rainfall Month: " + lowestRainfallMonth);

    }

    public static double totalRainfall(int[] rainfallAmount) {
        double totalRainfall = 0;
        for (int i = 0; i < rainfallAmount.length; i++) {
            totalRainfall += rainfallAmount[i];
        }
        return totalRainfall;
    }

    public static double averageRainfall(double totalRainfall, int months) {
        return totalRainfall / months;
    }

    public static int highestRainfallMonth(int[] amountOfRainfall) {
        int highestRainfall = amountOfRainfall[0];
        int month = 1;
        for (int i = 1; i < amountOfRainfall.length; i++) {
            if (amountOfRainfall[i] > highestRainfall) {
                highestRainfall = amountOfRainfall[i];
                month = i + 1;

            }
        }
        return month;
    }


    public static int lowestRainfallMonth(int[] amountOfRainfall) {
        int lowestRainfall = amountOfRainfall[0];
        int month = 1;
        for (int i = 1; i < amountOfRainfall.length; i++) {
            if (amountOfRainfall[i] < lowestRainfall) {
                lowestRainfall = amountOfRainfall[i];
                month = i + 1;
            }
            return month;
        }
        return lowestRainfall;
    }

}


