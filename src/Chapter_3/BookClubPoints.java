package Chapter_3;

import java.util.Scanner;

public class BookClubPoints {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of books purchased");
        int numberOfBooksPurchased = keyboard.nextInt();

        int numOfPoints;

        switch (numberOfBooksPurchased){
            case 0:
                numOfPoints = 0;
                System.out.println(numOfPoints);
                break;
            case 1:
                numOfPoints = 5;
                System.out.println(numOfPoints);
                break;
            case 2:
                numOfPoints = 15;
                System.out.println(numOfPoints);
                break;
            case 3:
                numOfPoints = 30;
                System.out.println(numOfPoints);
                break;
            case 4:
                numOfPoints = 60;
                System.out.println(numOfPoints);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
