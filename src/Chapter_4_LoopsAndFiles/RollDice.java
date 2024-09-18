package Chapter_4_LoopsAndFiles;

import java.util.Random;
import java.util.Scanner;

public class RollDice {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        String again ="y";

        while (again.equalsIgnoreCase("y")){
            int die1 = rand.nextInt(7);
            int die2 = rand.nextInt(7);

            System.out.println("Their values are die1: " + die1 + " and die2: " + die2);
            System.out.println("Roll them again? press y for yes and press any other key to end");
            again = keyboard.nextLine();
        }
    }
}
