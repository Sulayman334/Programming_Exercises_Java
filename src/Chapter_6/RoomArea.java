package Chapter_6;
import javax.swing.JOptionPane;

public class RoomArea {
    public static void main(String[] args) {

        Rectangle kitchen = new Rectangle();
        Rectangle bedroom = new Rectangle();
        Rectangle den = new Rectangle();

        String input = JOptionPane.showInputDialog("What is the kitchens length");
        double number = Double.parseDouble(input);
        kitchen.setLength(number);

        input = JOptionPane.showInputDialog("What is the kitchens width");
        number = Double.parseDouble(input);
        kitchen.setWidth(number);

        input = JOptionPane.showInputDialog("What is the bedrooms length");
        number = Double.parseDouble(input);
        bedroom.setLength(number);

        input = JOptionPane.showInputDialog("What is the bedrooms width");
        number = Double.parseDouble(input);
        bedroom.setWidth(number);

        input = JOptionPane.showInputDialog("What is the dens length");
        number = Double.parseDouble(input);
        kitchen.setLength(number);

        input = JOptionPane.showInputDialog("What is the dens width");
        number = Double.parseDouble(input);
        den.setWidth(number);

        double totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();
        JOptionPane.showMessageDialog(null, "The total area of the room is: " + totalArea);

    }
}
