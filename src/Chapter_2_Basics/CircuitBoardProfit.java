package Chapter_2_Basics;

import java.util.Scanner;

public class CircuitBoardProfit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the retail price of the circuit board:  ");
        double retailPrice = sc.nextDouble();

        double profitEarned = retailPrice * 0.4;
        System.out.println("The amount of profit is "+ profitEarned);
    }
}
