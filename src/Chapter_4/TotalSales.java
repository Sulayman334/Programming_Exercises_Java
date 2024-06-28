package Chapter_4;
import javax.swing.JOptionPane;
public class TotalSales {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("How many days do you have sales figure");
        int days = Integer.parseInt(input);

        double totalSales = 0.0;

        for (int count = 1; count <= days; count++){
            input = JOptionPane.showInputDialog("Enter the sales for day " + count);
            double sales = Double.parseDouble(input);

            totalSales +=sales;
        }
        JOptionPane.showMessageDialog(null,"The total sales: GMD " + totalSales);

    }
}
