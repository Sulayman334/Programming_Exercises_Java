package Chapter_4;

import java.util.Scanner;

public class SquareDisplay {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a positive integer not greater than 15");
        int positiveNumber = keyboard.nextInt();

        for (int i = 1; i <= positiveNumber;i++){
            for (int j = 1; j <= positiveNumber; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
