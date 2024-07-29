package Chapter_5;

import java.util.Scanner;

public class StockProfit {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of shares");
        int numOfShares = keyboard.nextInt();

        System.out.println("Enter the purchase price");
        double purchasePrice = keyboard.nextDouble();

        System.out.println("Enter the purchase commission ");
        double purchaseCommission = keyboard.nextDouble();

        System.out.println("Enter the sales commission ");
        double salesCommission = keyboard.nextDouble();

        System.out.println("Enter the sales price");
        double salesPrice = keyboard.nextDouble();
        double profitOrLoss = calculateProfit(numOfShares, purchasePrice, purchaseCommission, salesCommission, salesPrice);
        if (profitOrLoss > 0) {
            System.out.println("Profit: " + profitOrLoss);
        }  else if (profitOrLoss <=0){
            System.out.println("Loss: " + profitOrLoss);
        }

    }
    public static double calculateProfit(int numOfShares, double purchasePrice,
                                         double purchaseCommission, double salesCommission, double salesPrice) {
        return ((numOfShares * salesPrice) - salesCommission) - ((numOfShares * purchasePrice) +
                 purchaseCommission);

    }
}
