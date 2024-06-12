package Chapter_3;

import java.util.Scanner;

public class FatGramCalculator {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of calories");
        int numberOfCalories = keyboard.nextInt();

        System.out.println("Enter the number of fat gram");
        int numberOfFatGram = keyboard.nextInt();

        int caloriesFromFat = numberOfFatGram * 9;
        double percentageOfCalories = (double) caloriesFromFat / numberOfCalories;

        if (percentageOfCalories < 0.3){
            System.out.println("The food is low in fat");
        }

    }
}
