package Chapter_4_LoopsAndFiles;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a positive non negative value");
        int value = keyboard.nextInt();
        int sum=0;


        for (int i = 1; i <= value; i++ ){
            sum += i;
        }
        System.out.println("The sum of " + value +" is "+ sum);
    }

}
