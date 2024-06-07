package Chapter_3;

import java.util.Scanner;

public class CheckPoint8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        int y;

        if ( x > 100){
             y = 20;

        }else {
            y = 0;
        }
        System.out.println(y);
    }
}
