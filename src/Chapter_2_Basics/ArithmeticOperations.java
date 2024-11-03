package Chapter_2_Basics;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second integer");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int subtraction = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + subtraction);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
