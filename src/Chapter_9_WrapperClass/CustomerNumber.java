package Chapter_9_WrapperClass;
import javax.swing.JOptionPane;
public class CustomerNumber {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter "+ "a customer" +
                " number in the form LLLNNNN" +"(LLL = letters and NNNN = numbers)");

        if (isValid(input)){
            JOptionPane.showMessageDialog(null,"That a valid customer number");
        }
        else {
            JOptionPane.showMessageDialog(null,"That a invalid customer number");
        }


    }


    private static boolean isValid(String customerNumber){
        boolean goodSoFar = true;
        int i = 0;

        if (customerNumber.length() != 7){
            goodSoFar = false;
        }

        while (goodSoFar && i < 7){
            if (!Character.isDigit(customerNumber.charAt(i))){
                goodSoFar = false;
            }
        }
        return goodSoFar;
    }
}
