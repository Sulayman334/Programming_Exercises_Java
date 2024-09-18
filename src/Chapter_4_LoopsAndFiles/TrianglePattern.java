package Chapter_4_LoopsAndFiles;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the base:");
        int base = keyboard.nextInt();

        for (int i =0; i <= base;i++){
            for (int j = 0; j <=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
