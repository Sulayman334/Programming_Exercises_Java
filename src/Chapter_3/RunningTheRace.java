package Chapter_3;

import java.util.Scanner;

public class RunningTheRace {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter runner #1:");
        String runner1 = keyboard.nextLine();
        System.out.println("Enter the finish time (in minutes) of " + runner1 + ":");
        int runnerTime1 = keyboard.nextInt();
        keyboard.nextLine(); // Consume newline

        System.out.println("Enter runner #2:");
        String runner2 = keyboard.nextLine();
        System.out.println("Enter the finish time (in minutes) of " + runner2 + ":");
        int runnerTime2 = keyboard.nextInt();
        keyboard.nextLine(); // Consume newline

        System.out.println("Enter runner #3:");
        String runner3 = keyboard.nextLine();
        System.out.println("Enter the finish time (in minutes) of " + runner3 + ":");
        int runnerTime3 = keyboard.nextInt();
        keyboard.nextLine(); // Consume newline

        // Initial runner and time setup
        String firstRunner = runner1, secondRunner = runner2, thirdRunner = runner3;
        int firstTime = runnerTime1, secondTime = runnerTime2, thirdTime = runnerTime3;

        // Determine first place
        if (firstTime > secondTime) {
            // Swap first and second
            String tempRunner = firstRunner;
            int tempTime = firstTime;
            firstRunner = secondRunner;
            firstTime = secondTime;
            secondRunner = tempRunner;
            secondTime = tempTime;
        }
        if (firstTime > thirdTime) {
            // Swap first and third
            String tempRunner = firstRunner;
            int tempTime = firstTime;
            firstRunner = thirdRunner;
            firstTime = thirdTime;
            thirdRunner = tempRunner;
            thirdTime = tempTime;
        }
        if (secondTime > thirdTime) {
            // Swap second and third
            String tempRunner = secondRunner;
            int tempTime = secondTime;
            secondRunner = thirdRunner;
            secondTime = thirdTime;
            thirdRunner = tempRunner;
            thirdTime = tempTime;
        }

        // Display the results
        System.out.println("1st place: " + firstRunner + " with a time of " + firstTime + " minutes.");
        System.out.println("2nd place: " + secondRunner + " with a time of " + secondTime + " minutes.");
        System.out.println("3rd place: " + thirdRunner + " with a time of " + thirdTime + " minutes.");

        keyboard.close();
    }
}
