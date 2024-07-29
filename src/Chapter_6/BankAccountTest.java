package Chapter_6;
import javax.swing.JOptionPane;

public class BankAccountTest {
    public static void main(String[] args) {


        String input = JOptionPane.showInputDialog("What is your start balance");
        BankAccount account = new BankAccount(input);

        input = JOptionPane.showInputDialog("How much were you paid this month");
        account.deposit(input);

        JOptionPane.showMessageDialog(null,"You pay has been deposited and your current" +
                "balance is " + account.getBalance());

        input = JOptionPane.showInputDialog("How much were you asked to withdraw");
        account.withdraw(input);
        JOptionPane.showMessageDialog(null,"Now your balance is "+ account.getBalance());

        System.exit(0);
    }
}
