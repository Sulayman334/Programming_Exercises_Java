package Chapter_5_Methods;

import javax.swing.*;

public class CreditCard {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("What is your annual salary");
        double annualSalary = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("What is the rating of your credit card on the scale of 1:10 (10 for  Excellent" +
                " and 1 for very bad");
        int creditCardRating = Integer.parseInt(input);

        if (annualSalary >= 20000 && creditCardRating >= 7){
            qualify();
        }else {
            notQualified();
        }
    }

    public static void qualify(){
        JOptionPane.showMessageDialog(null,"Congratulation!\nYou are qualified for the " +
                "credit card");
    }

    public static void notQualified(){
        JOptionPane.showMessageDialog(null,"I am sorry!\nYou do not qualify for the credit card");
    }
}
