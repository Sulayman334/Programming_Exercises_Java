package Chapter_5;

import java.util.Scanner;

public class PresentValue {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the present Value");
        double presentValue = keyboard.nextDouble();

        System.out.println("Enter the number of years");
        int numberOfYears = keyboard.nextInt();

        System.out.println("Enter the annual interest rate");
        double annualInterestRate = keyboard.nextDouble()/100;
        double todayDeposit = presentValue(numberOfYears,annualInterestRate);
        System.out.println("The amount to be deposited is " + todayDeposit);
    }
    public static double presentValue( double numberOfYears, double annualInterestRate) {
        return 10000/ (1 + annualInterestRate) * numberOfYears;
    }
}
