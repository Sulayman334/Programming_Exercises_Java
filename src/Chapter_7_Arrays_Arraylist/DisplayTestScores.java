package Chapter_7_Arrays_Arraylist;

import java.util.Scanner;

public class DisplayTestScores {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many test do you have:");
        int testCount = keyboard.nextInt();

        int [] test = new int[testCount];

        for (int i = 0; i < testCount; i++) {
            System.out.println("Enter test " + (i+1) );
            test[i] = keyboard.nextInt();
        }
        System.out.println("Here are the scores you entered: ");
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i]+" ");
        }
    }
}
