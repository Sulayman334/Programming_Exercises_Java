package Chapter_10_OOP.ExceptionHandlingAndFileReader.BankingSystem;

public class BankAccount {

    private final String accountNumber;
    private final String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance)
            throws IllegalArgumentException {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        if (initialBalance < 0) {
            System.out.println("Invalid initial balance! Initial balance cannot be negative");
        }
    }


    public void deposit(double amount){
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (balance - amount < 0) {
            throw new InsufficientFundsException("Insufficient funds for this withdrawal.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }



}
