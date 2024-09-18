package Chapter_4_LoopsAndFiles;

import java.util.Scanner;

public class Population {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the starting number of organisms");
        int startingNumber = keyboard.nextInt();

        while (startingNumber < 2){
            System.out.println("The starting number of organisms must be greater then 2");
            startingNumber = keyboard.nextInt();
        }

        System.out.println("Enter the daily population increase");
        double populationIncreasePercent = keyboard.nextDouble() / 100;

        System.out.println("Enter the number of days they will multiply");
        int numOfMultiplyDays = keyboard.nextInt();

        System.out.println("Day \t\t\t\t Population \t\t\t\t Increase Rate ");
        System.out.println("------------------------------------------------------");

        for (int i = 1; i <= numOfMultiplyDays; i++){
            startingNumber += (int) (startingNumber * populationIncreasePercent);

            System.out.println(i +"\t\t\t\t\t\t"+ startingNumber+"\t\t\t\t\t\t\t\t\t"+populationIncreasePercent * 100);
        }

        
    }
}
