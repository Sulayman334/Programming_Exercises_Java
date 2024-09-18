package Chapter_3_Decision_Structures;

import javax.swing.*;

public class AverageScore {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter Score 1");
        double score1 = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter score 2");
        double score2 = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter score 3");
        double score3 = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter score 4");
        double score4 = Double.parseDouble(input);

        double total = score1 + score2 + score3 + score4;
        double average = total / 4;

        JOptionPane.showMessageDialog(null,"The Average score is "+ average);
        if (average > 5){
            JOptionPane.showMessageDialog(null,"Congratulations! You have passed");
        } else JOptionPane.showMessageDialog(null,"Not bad! but you can do better");

    }
}
