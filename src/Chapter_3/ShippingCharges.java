package Chapter_3;

import java.util.Scanner;

public class ShippingCharges {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the weight of the package");
        double weight = keyboard.nextDouble();
        double charges = 0;

        if (weight <= 2){
            charges = 1.10;
        }else
            if (weight > 2 && weight <= 6){
                charges = 2.20;
            }else
                if (weight > 6 && weight <= 10){
                    charges = 3.78;
                } else
                    if (weight > 10) {
                    charges = 3.80;
                     }
        System.out.println("Charges: " + charges);
    }
}
