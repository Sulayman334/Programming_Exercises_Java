package Chapter_4;

import java.util.Random;
import java.util.Scanner;

public class MathsTutor {
    public static void main(String[] args) {

        Scanner keyboard =  new Scanner(System.in);
        Random rand = new Random();

        int number1 = rand.nextInt(100);
        int number2 =rand.nextInt(100);

        System.out.println("What is the answer to the following question?");
        System.out.println(number1 +" + " + number2 + " = " );
        int userAnswer = keyboard.nextInt();

        int sum = number1 + number2;

        if (userAnswer == sum){
            System.out.println("Correct!");
        }else {
            System.out.println("Wrong! Try again");
        }

    }
}
