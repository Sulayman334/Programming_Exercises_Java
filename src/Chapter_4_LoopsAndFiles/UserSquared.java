package Chapter_4_LoopsAndFiles;

import java.util.Scanner;

public class UserSquared {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the max value");
        int maxValue = keyboard.nextInt();

        System.out.println("Number  Number Squared");
        System.out.println("----------------------");

        int number;
        for (number = 1; number <= maxValue; number++){
            System.out.println(number +"\t\t"+ Math.multiplyExact(number,number));
        }
    }
}
