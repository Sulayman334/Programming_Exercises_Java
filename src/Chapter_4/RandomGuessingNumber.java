package Chapter_4;

import java.util.Random;
import java.util.Scanner;

public class RandomGuessingNumber {
    public static void main(String[] args) {
        int guess;
        int guessCount = 0;
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Generate a random number");
        int randomNumber = rand.nextInt(10);

        System.out.println("Welcome to the random number generator");
        System.out.println("---------------------------------------");

        do {
            System.out.println("Guess what the number is ");
            guess = keyboard.nextInt();
            guessCount++;

            if (guess > randomNumber){
                System.out.println("Too high! Try again");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again");
            } else {
                System.out.println("Congratulations! You guessed the correct number");
                System.out.println("Attempts : "+guessCount);
                break;
            }
        } while (guess != randomNumber);

        System.out.println("Thanks for playing");


    }
}
