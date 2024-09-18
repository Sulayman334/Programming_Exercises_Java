package Chapter_4_LoopsAndFiles;

import java.util.Scanner;

public class SoccerPoints {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of points your team has earned for each game this session");
        System.out.println("Enter -1 when finished");
        System.out.println();
        System.out.println("Enter game points or -1 to end");
        int points = keyboard.nextInt();
        int totalPoints = 0;

        while (points != -1){
             totalPoints += points;

            System.out.println("Enter game points or -1 to end");
            points = keyboard.nextInt();
        }

        System.out.println("The total points is " + totalPoints);
    }
}
