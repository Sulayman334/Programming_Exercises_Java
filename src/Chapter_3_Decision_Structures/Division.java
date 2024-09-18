package Chapter_3_Decision_Structures;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the numerator");
        double numerator = keyboard.nextDouble();

        System.out.println("Enter the denominator");
        double denominator = keyboard.nextDouble();

        if (denominator == 0){
            System.out.println("You cannot divide by zero! Please enter a number other than zero");

        }else {
            double quotient = numerator / denominator;
            System.out.println("The quotient is " + quotient);
        }


    }
}
