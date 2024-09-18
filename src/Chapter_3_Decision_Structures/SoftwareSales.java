package Chapter_3_Decision_Structures;

import java.util.Scanner;

public class SoftwareSales {
    public static void main(String[] args) {
        double retailSoftwarePrice = 99,discountPercent = 0, amountOfDiscount, totalAmount;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of packages purchased");
        int numOfPackages = keyboard.nextInt();

        if (numOfPackages >= 10 && numOfPackages <= 99){
            discountPercent = 0.2;
        } else if (numOfPackages >= 20 && numOfPackages <= 49) {
            discountPercent = 0.3;
        } else if (numOfPackages >= 50 && numOfPackages <= 99) {
            discountPercent = 0.4;
        } else if (numOfPackages >= 100) {
            discountPercent = 0.5;
        }
        
        amountOfDiscount = discountPercent * retailSoftwarePrice;
        System.out.println("Discount: "+amountOfDiscount);
        totalAmount = (numOfPackages * retailSoftwarePrice) - amountOfDiscount;
        System.out.println("Total: " + totalAmount);
    }
}
