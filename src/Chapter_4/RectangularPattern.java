package Chapter_4;

import java.util.Scanner;

public class RectangularPattern {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many rows?");
        int rows = keyboard.nextInt();

        System.out.println("How many columns?");
        int columns = keyboard.nextInt();

        for (int i = 0; i < rows;i++){

            for (int j =0; j < columns;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
