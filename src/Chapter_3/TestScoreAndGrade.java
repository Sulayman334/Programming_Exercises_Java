package Chapter_3;
import java.util.Scanner;

public class TestScoreAndGrade {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter grade #1");
        double grade1 = keyboard.nextInt();

        System.out.println("Enter grade #2");
        double grade2 = keyboard.nextInt();

        System.out.println("Enter grade #3");
        double grade3 = keyboard.nextInt();

        double total = grade1 + grade2 + grade3;
        double average = total / 3;

        if (average >= 90 && average <= 100 ) {
            System.out.println("Grade: A");
        } else
            if (average >= 80 && average <= 89){
                System.out.println("Grade: B");
            } else
            if (average >= 70 && average <= 79){
                System.out.println("Grade: C");
            }else
            if (average >= 60 && average <= 69){
                System.out.println("Grade: D");
            }else
            if (average < 60){
                System.out.println("Grade: F");
            }else {
                System.out.println("Invalid Grade");
            }
    }

}
