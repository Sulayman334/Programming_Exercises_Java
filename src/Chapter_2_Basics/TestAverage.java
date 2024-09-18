package Chapter_2_Basics;

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter test score 1: ");
        double testScore1 = sc.nextDouble();

        System.out.println("Enter test score 2: ");
        double testScore2 = sc.nextDouble();

        System.out.println("Enter test score 3: ");
        double testScore3 = sc.nextDouble();

        double average =(testScore1 + testScore2 + testScore3) / 3;
        System.out.println("Average: " + Math.ceil(average));


    }
}
