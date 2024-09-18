package Chapter_5_Methods;

import java.util.Scanner;

public class PaintJobEstimator {
    public static void main(String[] args) {

        double squareFeetFor115WallSpace = 115;
        int  numberOfHoursFor115SquareFeet = 8;
        double paintChargesPerHour = 18;


        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of rooms to be painted: ");
        int numOfRoomsToBePainted = keyboard.nextInt();

        System.out.println("Enter the price of the paint per gallon");
        double priceOfPaintPerGallon = keyboard.nextDouble();

        System.out.println("Enter the square feet of the wall space in each room ");
        double squareOfWallSpace = keyboard.nextDouble();



    }


}
