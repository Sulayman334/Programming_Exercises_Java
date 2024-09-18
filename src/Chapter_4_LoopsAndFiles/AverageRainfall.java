package Chapter_4_LoopsAndFiles;

import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of years");
        int numberOfYears = keyboard.nextInt();
        int numberOfMonthsInAYear = 12;
        double totalInchesOfRainFall = 0;
        double average = 0;
        int numberOfMonths = numberOfYears * numberOfMonthsInAYear;

        for (int i =1; i <= numberOfYears; i++){
            System.out.println("Year "+i);
            keyboard.nextLine();

            for (int j = 1; j <= numberOfMonthsInAYear; j++){
                System.out.println("Enter the inches of rainfall for month "+j);
                double inchesOfRainFall = keyboard.nextInt();
                totalInchesOfRainFall += inchesOfRainFall;
                average = totalInchesOfRainFall / numberOfMonths;

            }
        }
        System.out.println("Total inches of rainfall: "+totalInchesOfRainFall);
        System.out.println("Total number of months :"+ numberOfMonths );
        System.out.println("Average: "+average);


    }
}
