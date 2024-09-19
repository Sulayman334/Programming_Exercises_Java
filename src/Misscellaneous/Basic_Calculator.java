package Misscellaneous;

import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {

        Basic_Calculator calculator = new Basic_Calculator();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double value1 = keyboard.nextDouble();

        System.out.println("Enter the second number:");
        double value2 = keyboard.nextDouble();

        while (true) {
            System.out.println("Choose operation");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            int choice = keyboard.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Result: " + calculator.add(value1, value2));
                    break;
                case 2:
                    System.out.println("Result: " + calculator.subtract(value1, value2));
                    break;
                case 3:
                    System.out.println("Result: " + calculator.multiply(value1, value2));
                    break;
                case 4:
                    if (value2 == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        System.out.println("Result: " + calculator.divide(value1, value2));
                    }
                    break;
                case 5:
                        System.out.println("Exiting...");
                        keyboard.close();
                    break;
                default:
                    System.out.println("Invalid choice");

            }

        }
    }
    public double add (double value1,double value2) {
        return value1 + value2;
    }

    public double subtract (double value1,double value2) {
        return value1 - value2;
    }

    public double multiply (double value1,double value2) {
        return value1 * value2;
    }

    public double divide (double value1,double value2) {
        return value1 / value2;
    }


}
