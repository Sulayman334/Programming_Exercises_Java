package Chapter_3_Decision_Structures;

import  javax.swing.JOptionPane;
public class LogicalAnd {
    public static void main(String[] args) {

        String input= JOptionPane.showInputDialog("Enter the number of years on the job");
        double years = Double.parseDouble(input);

        input= JOptionPane.showInputDialog("Enter your annual salary");
        double annualSalary = Double.parseDouble(input);

        if (years >= 3 && annualSalary >= 20000){
            JOptionPane.showMessageDialog(null,"Congratulation! You are qualified for the loan");
        }else {
            JOptionPane.showMessageDialog(null,"Sorry! You are not qualified fro the loan." +
                    "Your annual salary must be greater than or equal to $20000 and years on the job should be also greater " +
                    "than 3");
        }




    }
}
