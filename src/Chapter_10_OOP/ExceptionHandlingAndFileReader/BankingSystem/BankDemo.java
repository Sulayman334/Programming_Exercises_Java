package Chapter_10_OOP.ExceptionHandlingAndFileReader.BankingSystem;

import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the account number");
        String accountNumber = keyboard.nextLine();

        System.out.println("Enter the account holder name");
        String accountHolderName = keyboard.nextLine();

        System.out.println("Enter the initial balance");
        double initialBalance = keyboard.nextDouble();


        BankAccount banking = new BankAccount(accountNumber, accountHolderName, initialBalance);


        while (true){

                System.out.println("\nChoose an option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Exit");

                try {

                    int choice = keyboard.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Enter the amount to deposit");
                            double depositAmount = keyboard.nextDouble();
                            banking.deposit(depositAmount);
                            break;

                        case 2:
                            System.out.println("Enter the amount to withdraw:");
                            double withdrawalAmount = keyboard.nextDouble();

                            try {
                                banking.withdraw(withdrawalAmount);
                            } catch (InsufficientFundsException e) {
                                System.out.println("Insufficient funds: " + e.getMessage());
                            }
                            break;



                        case 3:
                            keyboard.close();

                            return;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please try again.");
                    keyboard.next();
                }

                finally {
                    System.out.println("Thank you for using our Banking System");
                    System.out.println("Account Name: "+banking.getAccountHolderName());
                    System.out.println("Account Number: "+banking.getAccountNumber());
                    System.out.println("Current Balance: "+banking.getBalance());

                }

            }

    }
}
