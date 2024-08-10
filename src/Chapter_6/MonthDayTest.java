package Chapter_6;

import java.util.Scanner;

public class MonthDayTest {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the month");
        int month = keyboard.nextInt();

        System.out.println("Enter the year");
        int year = keyboard.nextInt();

        MonthDays days = new MonthDays(month,year);
        System.out.println("Number of days in month "+month +" is " + days.getNumberOfDays());
    }
}
