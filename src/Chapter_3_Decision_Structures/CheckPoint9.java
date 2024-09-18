package Chapter_3_Decision_Structures;

import java.util.Scanner;

public class CheckPoint9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of y");
        int y = sc.nextInt();
        int x;

        if ( y == 100){
            x = 1;

        }else {
            x = 0;
        }
        System.out.println(x);
    }
}
