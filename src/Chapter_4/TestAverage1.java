package Chapter_4;

import java.util.Scanner;

public class TestAverage1 {
    public static void main(String[] args) {
        char repeat;

        Scanner keyboard = new Scanner(System.in);

        do {
        System.out.println("Enter score #1");
        int score1 = keyboard.nextInt();

        System.out.println("Enter score #2");
        int score2 = keyboard.nextInt();

        System.out.println("Enter score #3");
        int score3 = keyboard.nextInt();

        keyboard.nextLine();
        double average = (double) (score1 + score2 + score3) / 3;
        System.out.println("Average: " + average);

            System.out.println("Would you like to calculate another set of average?");
            System.out.println("Enter Y/y for Yes and N/n for No");
            String input =keyboard.nextLine();
            repeat = input.charAt(0);
        } while (repeat == 'Y' || repeat == 'y');


    }
}
