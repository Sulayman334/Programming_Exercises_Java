package Chapter_4;

import java.util.Random;
import java.util.Scanner;


public class ESPGame {
    public static void main(String[] args) {

        String color;
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Select a secret number");
        int secretNumber = rand.nextInt(5);

        keyboard.nextLine();

        if (secretNumber == 0) {
            color = "red";
        } else if (secretNumber == 1) {
            color = "green";
        } else if (secretNumber == 2) {
            color = "blue";
        } else if (secretNumber == 3) {
            color = "yellow";
        } else {
            color = "orange";
        }
        String guessedColor;

        for (int i = 1; i <=10;i++) {
            System.out.println("Enter the color the computer has selected");
            guessedColor = keyboard.nextLine();

        }



    }
}
