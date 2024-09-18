package Chapter_3_Decision_Structures;

import java.util.Scanner;

public class CheckPoint1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of y");
        int y = sc.nextInt();
        int x;

        if ( y == 20 ){
             x = 0;
            System.out.println("x: " + x);
        }else
            System.out.println("Then y is not equal to 20");

    }
}
