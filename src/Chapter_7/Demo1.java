package Chapter_7;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        final int EMPLOYEES = 3;
        int [] hours = new int[EMPLOYEES];

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of hours worked by employee 1");
        hours[0] = keyboard.nextInt();

        System.out.println("Enter the number of hours worked by employee 2");
        hours[1] = keyboard.nextInt();

        System.out.println("Enter the number of hours worked by employee 3");
        hours[2] = keyboard.nextInt();

        System.out.println("The number of hours are: ");
        System.out.println("Employee 1: "+ hours[0]);
        System.out.println("Employee 2: "+ hours[1]);
        System.out.println("Employee 3: "+ hours[2]);




    }
}
