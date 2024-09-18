package Chapter_4_LoopsAndFiles;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {

        int computerWins =0;
        int userWins =0;

        Random rand = new Random();

        int computer,user;

        for (int i=1; i <=10;i++) {
            System.out.println("Round "+i);
            computer = rand.nextInt(7);
            System.out.println("Computer roll "+" : "+computer);


            user = rand.nextInt(7);
            System.out.println("User roll :"+ +user);

            if (computer > user){
                computerWins++;
                System.out.println("Computer wins this round");
            } else if (user >computer) {
                userWins++;
                System.out.println("User wins this round");
            }else {
                System.out.println("It is a tie");
            }


        }
        System.out.println("Final Result");
        System.out.println("Computer wins : "+computerWins);
        System.out.println("User wins : "+userWins);

        if (computerWins > userWins){
            System.out.println("The grand winner is the computer");
        }else if (userWins > computerWins){
            System.out.println("The grand winner is the user");
        }else {
            System.out.println("It is an absolute tie");
        }


    }
}
