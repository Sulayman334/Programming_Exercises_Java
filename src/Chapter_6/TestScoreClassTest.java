package Chapter_6;

import java.util.Scanner;

public class TestScoreClassTest {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter test score 1");
        int testScore1 = keyboard.nextInt();

        System.out.println("Enter test score 2");
        int testScore2 = keyboard.nextInt();

        System.out.println("Enter test score 3");
        int testScore3 = keyboard.nextInt();

        TestScoreClass test = new TestScoreClass(testScore1,testScore2,testScore3);

        System.out.println("Average score: "+ test.averageTestScore(testScore1, testScore2, testScore3));
    }

}
