package Chapter_4;

import java.util.Random;
import java.util.Scanner;


public class ESPGame {
    public static void main(String[] args) {

        String color;
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);
        int secretNumber = rand.nextInt(5);

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
        System.out.println(color);
        System.out.println("--------------------------------");

        for (int i = 0; i <10;i++) {
            System.out.println("Enter the color that the computer has selected");
            color = keyboard.nextLine();
            System.out.println(color);

        }
    }
}
