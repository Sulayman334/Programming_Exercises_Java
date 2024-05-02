package Chapter_2;

public class EnergyDrinkConsumption {
    public static void main(String[] args) {

        int numberOfCustomersSurveyed = 12467;
        double customersPercentageThatPurchasedOneOrMoreDrinks = 0.14; //14%
        double customersPercentageThatPurchaseCitrus = 0.64;

        int oneOrMoreDrinks = (int) (numberOfCustomersSurveyed * customersPercentageThatPurchasedOneOrMoreDrinks);
        int citrusPurchase = (int) (oneOrMoreDrinks * customersPercentageThatPurchaseCitrus);
        System.out.println(oneOrMoreDrinks);
        System.out.println(citrusPurchase);


    }
}
