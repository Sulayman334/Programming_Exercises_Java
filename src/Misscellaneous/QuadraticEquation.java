package Misscellaneous;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = keyboard.nextInt();

        System.out.println("Enter the value of b");
        int b = keyboard.nextInt();

        System.out.println("Enter the value of c");
        int c = keyboard.nextInt();

        double discriminant = Math.pow(b,2) - (4 * a * c);
        double positiveVersion;
        System.out.println("Discriminant: " + discriminant);
        if (discriminant >= 0){
            positiveVersion = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println(positiveVersion);
        }else {
            System.out.println("P:Their are no real roots");
        }

        if (discriminant >=0){
           double negativeVersion=(-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println(negativeVersion);
        } else {
            System.out.println("N:Their are no real roots");
        }
    }
}
