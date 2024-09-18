package Chapter_6_Classes;

public class SavingsAccountClass {

    private double StartingBalance;
    private double annualInterestRate;
    private double totalDeposits = 0;
    private double totalWithdrawals = 0;
    private double totalInterestEarned = 0;


    public SavingsAccountClass (double StartingBalance){
        this.StartingBalance = StartingBalance;
    }

    public void deposit(double amount){
        StartingBalance += amount;
        totalDeposits += amount;

    }

    public void withdraw(double amount){
        StartingBalance -= amount;
        totalWithdrawals += amount;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public void addMonthlyInterest() {
        double monthlyInterestRate = annualInterestRate / 12;
        double interest = StartingBalance * monthlyInterestRate;
        StartingBalance += interest;
        totalInterestEarned += interest;
    }

    public double getStartingBalance(){
        return StartingBalance;
    }

    public double getTotalDeposits(){
        return totalDeposits;
    }

    public double getTotalWithdrawals(){
        return totalWithdrawals;
    }

    public double getTotalInterestEarned(){
        return totalInterestEarned;
    }


}
