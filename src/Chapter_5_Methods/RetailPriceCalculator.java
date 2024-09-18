package Chapter_5_Methods;

import java.util.Scanner;

public class RetailPriceCalculator {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the wholesale price");
        double wholesalePrice = keyboard.nextInt();

        System.out.println("Enter the markup percentage");
        double markupPercentage = keyboard.nextDouble() / 100;

        double retailPrice = retailPriceCalculator(wholesalePrice,markupPercentage);
        System.out.println("Retail Price: "+retailPrice);

    }
    public static double retailPriceCalculator(double wholesalePrice, double markupPercentage){
        return wholesalePrice + (wholesalePrice * markupPercentage);

        // retail = wholesalePrice +(wholesales * markupPercentage)
    }
}
