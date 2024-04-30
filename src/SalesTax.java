import java.util.Scanner;
public class SalesTax {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount of purchase: ");
        double amountOfPurchase = keyboard.nextDouble();

        final double COUNTY_TAX_PERCENT = 0.02; //2%
        final double STATE_TAX_PERCENT = 0.04; //4%

        double amountOfCountyTax = COUNTY_TAX_PERCENT * amountOfPurchase;
        double amountOfStateSalesTax = STATE_TAX_PERCENT * amountOfPurchase;
        double totalSalesTax = amountOfStateSalesTax + amountOfCountyTax;
        double totalOfTheSales = totalSalesTax + amountOfPurchase;

        System.out.println("The amount of purchase: "+ amountOfPurchase);
        System.out.println("The amount of county tax: "+amountOfCountyTax);
        System.out.println("The amount of state sales tax: "+amountOfStateSalesTax);
        System.out.println("The total sales tax : "+totalSalesTax);
        System.out.println("The total of the sales: "+ totalOfTheSales);



    }
}

