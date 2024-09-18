package Chapter_3_Decision_Structures;

import java.util.Scanner;

public class MagicDate {
    public static void main(String[] args) {

        Scanner keyboard  = new Scanner(System.in);
        System.out.println("Enter a month in digits");
        int month = keyboard.nextInt();

        System.out.println("Enter a day in digits");
        int day = keyboard.nextInt();

        System.out.println("Enter a two digit year");
        int year = keyboard.nextInt();

        if (month * day == year){
            System.out.println("The date is magic");
        }else {
            System.out.println("It is not magic");
        }

    }
}
