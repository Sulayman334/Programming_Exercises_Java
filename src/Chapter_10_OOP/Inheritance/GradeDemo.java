package Chapter_10_OOP.Inheritance;
import javax.swing.JOptionPane;
public class GradeDemo {
    public static void main(String[] args) {

        GradedActivity grade = new GradedActivity();

        String input = JOptionPane.showInputDialog("Enter a numeric test score ");
        double testScore = Double.parseDouble(input);

        grade.setScore(testScore);

        JOptionPane.showMessageDialog(null,"The grade for that test is " + grade.getGrade());

    }
}
