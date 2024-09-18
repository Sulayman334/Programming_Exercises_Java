package Chapter_2_Basics;

public class StockCommission {
    public static void main(String[] args) {

        double priceOfStockPerShare = 21.77;
        int numberOfSharesBought = 600;

        final double stockBrokerCommissionPercent =0.02; //2%

        double amountPaidForTheStockAlone = numberOfSharesBought * priceOfStockPerShare;
        double amountOfCommission = amountPaidForTheStockAlone * stockBrokerCommissionPercent;
        double totalAmountPaid = amountOfCommission + amountPaidForTheStockAlone;
        System.out.println("The amount paid for the stock alone is: "+amountPaidForTheStockAlone);
        System.out.println("The amount of commission is: "+ amountOfCommission);
        System.out.println("The total amount paid is "+ totalAmountPaid);
    }
}
