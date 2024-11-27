package Chapter_2_Basics;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = keyboard.nextInt();

        if(age < 12){
            System.out.println("Child");
        }else if (age > 13 && age < 17){
            System.out.println("Teenager");
        } else if (age >= 18 && age < 65 ){
            System.out.println("Adult");
        }else if (age >= 65){
            System.out.println("Senior");
        }



    }
}
