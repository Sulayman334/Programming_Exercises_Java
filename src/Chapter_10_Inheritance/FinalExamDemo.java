package Chapter_10_Inheritance;
import javax.swing.JOptionPane;
public class FinalExamDemo {
    public static void main(String[] args) {

        String input;
        int question;
        int missed;
        input = JOptionPane.showInputDialog("How many questions are on the final exam?");
        question = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("How many questions did the students missed?");
        missed = Integer.parseInt(input);

        FinalExam exam = new FinalExam(question, missed);

        JOptionPane.showMessageDialog(null,"Each question counts "+exam.getPointsEach() +
                " points\n The exam score is "+exam.getScore()+" points\n The grade is "+exam.getGrade());


    }
}
