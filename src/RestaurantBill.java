import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {

        final double TAX_PERCENT = 0.0675;
        final double TIP_PERCENT = 0.2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the charge for the meal");
        double mealCharge = sc.nextDouble();

        double amountOfTax = TAX_PERCENT * mealCharge;
        double totalAmount = amountOfTax + mealCharge;
        double amountOfTip = TIP_PERCENT* totalAmount;
        double totalBill = amountOfTax + amountOfTax + mealCharge;
        System.out.println("Tax amount : " + amountOfTax);
        System.out.println("Tip amount : " + amountOfTip);
        System.out.println("Total Bill : " + totalBill);
    }
}
