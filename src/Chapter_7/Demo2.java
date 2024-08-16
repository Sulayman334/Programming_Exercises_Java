package Chapter_7;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        final int EMPLOYEES = 3;
        int [] hours = new int [EMPLOYEES];

        System.out.println("Enter the number of hours worked by the "+EMPLOYEES +" employees");

        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Employee " + (i +1) );
            hours[i] = keyboard.nextInt();
        }

        for (int i =0;i < EMPLOYEES; i++) {
            System.out.println("Employee "+(i+1) +" has "+hours[i]);
        }


    }
}
