package Chapter_3_Decision_Structures;

import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of seconds");
        int seconds = keyboard.nextInt();

        if (seconds >= 60){
            int minutes = seconds/60;

            // inorder to get the remaining seconds, you need to collect the mod/reminder.
            int remainingSecond = seconds % 60;
            System.out.println(minutes +" minute:"+ remainingSecond +" seconds");

        }if (seconds >= 3600){
            int hours = seconds / 3600;
            System.out.println(hours + " Hours");
        }
        if (seconds >= 86400){
            int numOfDays = seconds /86400;
            System.out.println(numOfDays + " Days");
        }else {
            System.out.println("Invalid Seconds");
        }
    }
}
