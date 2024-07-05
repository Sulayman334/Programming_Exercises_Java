package Chapter_4;

import java.util.Scanner;

public class PenniesForPay {
    public static void main(String[] args) {

       Scanner keyboard = new Scanner(System.in);
       System.out.println("Enter the number of days you have worked for:");
       int numberOfDays = keyboard.nextInt();

       double totalPayInDollars =0;
       double payPerDayInDollars;
       double payPerDayInInPenny = 1;

        System.out.println("Day "+" \t\t\t\t " +"Pay In Dollars");
        System.out.println("------------------------------------");
       for (int i = 1; i <= numberOfDays; i++){

           payPerDayInDollars = payPerDayInInPenny / 100;
           System.out.println("Day " + i+"\t\t\t\t\t\t"+ payPerDayInDollars);
           payPerDayInInPenny *=2;
           totalPayInDollars += payPerDayInDollars;

       }
        System.out.println("The total pay in dollars is: "+totalPayInDollars);

    }
}
