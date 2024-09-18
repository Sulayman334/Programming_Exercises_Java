package Chapter_3_Decision_Structures;

import java.util.Scanner;

public class BankCharges {
    public static void main(String[] args) {

        double baseFeePerMonth = 10;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of check written for a month");
        int numOfChecks = keyboard.nextInt();

        double bankServiceFee = 0.0;

        if (numOfChecks < 20){
            bankServiceFee = baseFeePerMonth + 0.10;
            System.out.println(bankServiceFee);
        }else
            if (numOfChecks >= 20 && numOfChecks <= 39){
                bankServiceFee = baseFeePerMonth + 0.08;
            }else
                if (numOfChecks >= 40 && numOfChecks <= 59){
                    bankServiceFee = baseFeePerMonth + 0.06;
                }else
                    if (numOfChecks >= 60){
                        bankServiceFee = baseFeePerMonth + 0.04;
                    }

        System.out.println(bankServiceFee);
    }
}
