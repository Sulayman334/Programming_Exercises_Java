package Chapter_6;

public class BankAccount {

    private double balance;

    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public BankAccount(String str){
        balance = Double.parseDouble(str);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void deposit(String str){
        balance+=Double.parseDouble(str);
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void withdraw(String str){
        balance-=Double.parseDouble(str);
    }
    public void setBalance(double b){
        balance = b;
    }
    public double getBalance() {
        return balance;
    }
}
