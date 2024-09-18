package Chapter_9_WrapperClass;
import javax.swing.JOptionPane;
public class CharacterTest {
    public static void main(String[] args) {

        String input;
        char ch;

        input = JOptionPane.showInputDialog("Enter any single character");
        ch = input.charAt(0);

        if (Character.isLetter(ch)) {
            JOptionPane.showMessageDialog(null,"This is a letter");
        }

        if (Character.isDigit(ch)) {
            JOptionPane.showMessageDialog(null,"This is a digit");
        }

        if (Character.isWhitespace(ch)) {
            JOptionPane.showMessageDialog(null,"This is a whitespace");
        }

        if (Character.isUpperCase(ch)) {
            JOptionPane.showMessageDialog(null,"This is upper case");
        }

    }
}
