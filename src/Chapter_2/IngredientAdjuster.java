package Chapter_2;

import java.util.Scanner;
public class IngredientAdjuster {
    public static void main(String[] args) {

        double cupOfSugar = 1.5;
        double cupOfButter = 1;
        double cupOfFlour = 2.75;
        int numberOfCookiesProducedWithTheseRecipes= 48;

        Scanner sc = new Scanner(System.in);
        System.out.println("How many cookies do you want to make: ");
        int numberOfCookies = sc.nextInt();

        double newCupOfButter =  (cupOfButter * numberOfCookies ) / numberOfCookiesProducedWithTheseRecipes;
        double newCupOfSugar = (cupOfSugar * numberOfCookies ) / numberOfCookiesProducedWithTheseRecipes;
        double newCupOfFlour = (cupOfFlour * numberOfCookies ) / numberOfCookiesProducedWithTheseRecipes;
        System.out.println("Cups of butter: "+newCupOfButter);
        System.out.println("Cups of sugar: "+newCupOfSugar);
        System.out.println("Cups of flour: " + newCupOfFlour);


    }
}
