package Misscellaneous;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your birth year");
        int birthYear = keyboard.nextInt();

        System.out.println("Enter the current year");
        int currentYear = keyboard.nextInt();

        int age = currentYear - birthYear;
        System.out.println(age);


    }
}
