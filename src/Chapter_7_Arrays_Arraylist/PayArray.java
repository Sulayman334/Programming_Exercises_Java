package Chapter_7_Arrays_Arraylist;

import java.util.Scanner;

public class PayArray {
    public static void main(String[] args) {

        final int EMPLOYEES = 5;
        int [] hours = new int [EMPLOYEES];

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of hours worked by " + EMPLOYEES+" employees who all earn the same hourly" +
                "pay rate");

        for (int i = 0;i < EMPLOYEES;i++) {
            System.out.println("Employee " + (i+1) );
            hours[i] = keyboard.nextInt();
        }

        System.out.println("Enter the hourly pay rate");
        double payRate = keyboard.nextDouble();
        double grossPay;

        for (int i = 0;i < EMPLOYEES;i++) {
            grossPay =  (hours[i] * payRate);

            System.out.println("Employee " + (i+1) + grossPay);
        }
    }
}
