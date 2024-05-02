package Chapter_2;

public class StockTransactionProgram {
    public static void main(String[] args) {


        // purchased
        int numberOfSharesPurchased = 1000;
        double purchasedPricePerShare = 32.87;
        double stockBrokerPurchasedPercent = 0.02; //2%

        //sold
        int numberOfSharesSold = 1000;
        double soldPricePerShare = 33.92;
        double stockBrokerSoldPercent = 0.02; // 2%

        double amountPaidForTheStock = numberOfSharesPurchased * purchasedPricePerShare;
        double purchasedAmountPaidToTheStockBroker = stockBrokerPurchasedPercent * amountPaidForTheStock;
        double amountSoldForTheStock = numberOfSharesSold * soldPricePerShare;
        double soldAmountPaidToTheStockBroker = amountSoldForTheStock * stockBrokerSoldPercent;
        double profitOrLost =(amountSoldForTheStock - soldAmountPaidToTheStockBroker)
                - (amountPaidForTheStock - purchasedAmountPaidToTheStockBroker);


        System.out.println("The amount of money paid for the stock is " + amountPaidForTheStock);
        System.out.println("The amount of commission paid to the stock broker when buying the stock is "
                + purchasedAmountPaidToTheStockBroker);
        System.out.println("The amount sold for the stock is " + amountSoldForTheStock);
        System.out.println("The amount of commission paid to the stock broker when selling the stock is "
                + soldAmountPaidToTheStockBroker);
        System.out.println("The amount of profit is " + profitOrLost);





    }
}
