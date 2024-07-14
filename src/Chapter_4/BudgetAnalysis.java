package Chapter_4;

import java.util.Scanner;

public class BudgetAnalysis {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount you budgeted for the month");
        int budgetedAmount = keyboard.nextInt();
        int monthlyExpenses;
        double total = 0.0;
        int daysInAMonth = 31;

        for (int i = 1; i <= daysInAMonth;i++){
            System.out.println("Enter your expenses for day "+ i);
            monthlyExpenses = keyboard.nextInt();

            total += monthlyExpenses;
        }
        System.out.println(total);
        if (total >budgetedAmount ){
            System.out.println("The amount is under budget");
        } else {
            System.out.println("The amount is over budget");
        }
    }

}
