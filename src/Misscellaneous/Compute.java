package Misscellaneous;
import java.util.Scanner;
public class Compute {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();


        System.out.println("Sum of even numbers from 2 to 100 : " + sumOfEvenNumber());
        System.out.println("Sum of all squares from 1 to 100 : " + sumOfSquares());
        System.out.println("Sum of odd numbers : " + calculateOddSum(1, 100));
        System.out.println("Sum of odd digits of an input " + number + " : " + calculateOddDigitSum(number));

    }

    // Method to calculate the sum of even numbers from 2 to 100 using a for loop.
    public static int sumOfEvenNumber(){
        int sum =0;
        for (int i = 2; i <= 100; i +=2){
             sum += i;
        }
        return sum;
    }


    public static int sumOfSquares() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        return sum;
    }


    public static int calculateOddSum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int calculateOddDigitSum(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
