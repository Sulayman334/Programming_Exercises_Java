package Chapter_2_Basics;

import java.util.Scanner;
public class CookiesCalories {
    public static void main(String[] args) {

        int bagOfCookie = 40;
        int numberOfServing = 10;
        double numberOfCaloriesInAServing = 300;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of cookies consumed: ");
        int numberOfCookiesConsumed = keyboard.nextInt();

        double totalNumberOfCaloriesInTheBag = numberOfServing * numberOfCaloriesInAServing;
        double totalNumberOfCaloriesConsumed = (totalNumberOfCaloriesInTheBag * numberOfCookiesConsumed) / bagOfCookie;
        System.out.println(totalNumberOfCaloriesConsumed);

    }
}
