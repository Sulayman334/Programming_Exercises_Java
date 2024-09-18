package Chapter_7_Arrays_Arraylist;

import java.util.Scanner;

public class PayRollTest {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of hours");
        int hours = keyboard.nextInt();

        System.out.println("Enter the pay rate");
        int payRate = keyboard.nextInt();

        if (hours <0 || payRate < 6){
            System.out.println("Invalid input");
        }
    }
}
