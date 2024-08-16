package Chapter_7;
import Chapter_6.BankAccount;

import java.util.ArrayList;
public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        list.add(new BankAccount(100));
        list.add(new BankAccount(500));
        list.add(new BankAccount(1500));

        for (int i = 0; i < list.size(); i++) {
            BankAccount b = list.get(i);
            System.out.println("Account at index " + i + "\nBalance: " +b.getBalance());
        }
    }
}
