package Chapter_5;

import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random rand = new Random();
        int computerChoice = rand.nextInt(3) + 1;
        if (computerChoice == 1){
            //System.out.println("Rock");
        } else if (computerChoice ==2) {
           // System.out.println("Paper");
        } else {
           // System.out.println("Scissors");
        }

        System.out.println("Enter your choice");

    }
}
