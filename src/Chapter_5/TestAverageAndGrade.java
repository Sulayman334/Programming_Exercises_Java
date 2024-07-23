package Chapter_5;

import java.util.Scanner;

public class TestAverageAndGrade {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 5 test scores");

        System.out.println("Enter test score 1");
        double testScore1 = keyboard.nextDouble();

        System.out.println("Enter test score 2");
        double testScore2= keyboard.nextDouble();

        System.out.println("Enter test score 3");
        double testScore3 = keyboard.nextDouble();

        System.out.println("Enter test score 4");
        double testScore4 = keyboard.nextDouble();

        System.out.println("Enter test score 5");
        double testScore5 = keyboard.nextDouble();

        String grade = determineGrade(testScore1);
        System.out.println("Letter Grade for test score 1: " + grade);

        double average = calAverage(testScore1, testScore2, testScore3, testScore4, testScore5);
        System.out.println("Average: " + average);
    }
    public static double calAverage(double testScore1, double testScore2, double testScore3,
                                    double testScore4, double testScore5){
        return (testScore1 + testScore2 + testScore3 + testScore4 + testScore5) / 5;
    }
    
    public static String determineGrade(double testScore1) {
        String grade = "";

        if (testScore1 >= 90 && testScore1 <= 100) {
            grade = "A";
        } else if (testScore1 >= 80 && testScore1 <= 89) {
            grade = "B";
        } else if (testScore1 >= 70 && testScore1 <= 79) {
            grade = "C";
        } else if (testScore1 >= 60 && testScore1 <= 69) {
            grade = "D";
        } else if (testScore1 < 60) {
            grade = "F";
        }else {
            System.out.println("Invalid Grade");
        }

        return grade;
    }
}
