package Chapter_3_Decision_Structures;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the weight of the body");
        double weight = keyboard.nextDouble();

        System.out.println("Enter the height");
        double height = keyboard.nextDouble();

        double BMI = weight * 703/Math.pow(height,2);
        if (BMI < 18.5){
            System.out.println("You are under weight");
        }else
        if (BMI >= 18.5 && BMI <= 25){
            System.out.println("Your weight is optimal");
        } else
            if (BMI > 25) {
            System.out.println("You are over weight");

        }
    }
}
