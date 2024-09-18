package Chapter_6_Classes;

import java.util.Scanner;

public class CellPhoneTest {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the name of the manufacturer");
        String manufacturer = keyboard.nextLine();

        System.out.println("Enter the model number");
        String modelNumber = keyboard.nextLine();

        System.out.println("Enter the retail Price");
        double retailPrice = keyboard.nextDouble();

        CellPhone phone = new CellPhone(manufacturer,modelNumber,retailPrice);

        System.out.println("Manufacturer: " + phone.getManufacturer());
        System.out.println("Model number: " + phone.getModel());
        System.out.println("Retail Price: " + phone.getRetailPrice());
    }
}
