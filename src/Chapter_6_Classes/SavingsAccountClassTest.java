package Chapter_6_Classes;

import java.util.Scanner;

public class SavingsAccountClassTest {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the starting  balance");
        double startingBalance = keyboard.nextDouble();

        System.out.println("Enter the annual interest rate");
        double annualInterestRate = keyboard.nextDouble();

        System.out.println("Enter the month the account was established");
        int accountEstablishmentMonth = keyboard.nextInt();

        SavingsAccountClass savings = new SavingsAccountClass(startingBalance);
        savings.setAnnualInterestRate(annualInterestRate);


        for (int i = 1;i <= accountEstablishmentMonth;i++) {
            System.out.println(accountEstablishmentMonth + " : " + i +" Enter amount deposited");
            double deposit = keyboard.nextDouble();
            savings.deposit(deposit);

            System.out.println(accountEstablishmentMonth + " " + i +" Enter amount withdrawn");
            double withdrawal = keyboard.nextDouble();
            savings.withdraw(withdrawal);

            savings.addMonthlyInterest();

        }

        System.out.println("Total Deposit: " + savings.getTotalDeposits());
        System.out.println("Total Withdrawals: "+ savings.getTotalWithdrawals());

    }
}
