package Chapter_3_Decision_Structures;

import java.util.Scanner;

public class InternetServiceProvider {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Which package do you prefer (A, B or C)");
        char servicePackage = keyboard.next().toUpperCase().charAt(0);

        System.out.println("Enter the number of hours used");
         int numberOfHours = keyboard.nextInt();

         double totalCharges = 0.0;
         int hours = 0;

        if (servicePackage == 'A'){
            totalCharges = 9.95;
            if (hours > 10){
                totalCharges += 2.00;
            }
        }else
            if (servicePackage == 'B'){
                totalCharges =13.95;
                if (hours > 20){
                    totalCharges = 1.00;
                }
            } else
                if (servicePackage == 'C') {
                    totalCharges = 19.95;

            }
        System.out.println(totalCharges);


    }
}
