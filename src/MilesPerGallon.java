import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the miles driven: ");
        double milesDriven = sc.nextDouble();

        System.out.println("Enter the number of gallons used: ");
        double numberOfGallonsUsed = sc.nextDouble();

        double milesPerGallons = milesDriven/numberOfGallonsUsed;
        System.out.println("The number of miles driven: "+ milesPerGallons);
    }
}
