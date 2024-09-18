package Chapter_4_LoopsAndFiles;

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int score;
        int total =0;

        System.out.println("How many students do you have ");
        int numOfStudents = keyboard.nextInt();

        System.out.println("How many test scores per student");
        int numOfTestScoresPerStudent = keyboard.nextInt();

        for (int students =1 ; students <= numOfStudents; students++){

            System.out.println("Students :" + students);
            System.out.println("----------------------");


            for (int test =1; test <= numOfTestScoresPerStudent; test++){
                System.out.println("Enter score:" + test);
                score = keyboard.nextInt();

                total += score;

            }
            double average = (double) total /numOfTestScoresPerStudent;
            System.out.println("The average for student number " + numOfStudents + " is "+ average);
        }


    }
}
