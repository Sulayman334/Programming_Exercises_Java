public class SimpleBankingSystem {
    String accountHolder;
    String accountNumber;
    double balance;

    public SimpleBankingSystem(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public static void main(String[] args) {
        SimpleBankingSystem account1 = new SimpleBankingSystem("Alima", "001", 500.0);

        account1.deposit(500.0);
        System.out.println("New balance: " + account1.getBalance());

        boolean success = account1.withdraw(2000.0);
        if (success) {
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient funds");
        }

        System.out.println("Final balance: " + account1.getBalance());
    }
}
