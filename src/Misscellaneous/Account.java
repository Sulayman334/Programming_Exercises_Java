package Misscellaneous;

public class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public static void main(String[] args) {
        Account account = new Account(500);
        account.deposit(500);
        System.out.println(account.getBalance());
    }

}
