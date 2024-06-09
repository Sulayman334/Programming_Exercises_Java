package Chapter_3;

import java.util.Scanner;

public class MassAndWeight {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the mass of the object");
        double mass = keyboard.nextDouble();

        double weight = mass * 9.8;
        if (weight > 1000){
            System.out.println("The object is over weight");
        }
        else
            if (weight < 10){
                System.out.println("The object is light weight");
            }else {
                System.out.println("It was not included in the question");
            }
    }
}
