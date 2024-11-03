package Chapter_10_OOP.ExceptionHandlingAndFileReader;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {

        int numerator;
        int denominator;


        Scanner keyboard = new Scanner(System.in);
        try
        {
            System.out.println("Enter the numerator");
            numerator = keyboard.nextInt();

            System.out.println("Enter the denominator");
            denominator = keyboard.nextInt();
            int results  = numerator / denominator;
            System.out.println(results);
        } catch (ArithmeticException e) {
            System.out.println("Invalid input");
        }
        finally {
            keyboard.close();
        }
    }
}
