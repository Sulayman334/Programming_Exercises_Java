package Chapter_2_Basics;

public class SalesPrediction {
    public static void main(String[] args) {
        double salesPercentage = 0.62; // 62%
        double annualTotalSales = 4600000;
        double eastCoastTotalSales = salesPercentage * annualTotalSales;
        System.out.println(eastCoastTotalSales);

    }
}
