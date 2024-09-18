package Chapter_7_Arrays_Arraylist;

import java.util.Scanner;

public class PayArray2 {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 4;
        int[] number = new int[ARRAY_SIZE];
        getValues(number);

        System.out.println("Here are the numbers you entered ");
        showArray(number);

    }

    private static void getValues(int[] array) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the series of " + array.length + " numbers");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number " + (i+1));
            array[i] = keyboard.nextInt();
        }
    }


    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
