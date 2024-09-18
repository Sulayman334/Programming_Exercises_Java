package Chapter_5_Methods;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = keyboard.nextInt();

        boolean isPrime = isPrime(number);
        System.out.println(isPrime);
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
