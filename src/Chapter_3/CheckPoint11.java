package Chapter_3;

import java.util.Scanner;

public class CheckPoint11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valur of A");
        int a = sc.nextInt();

        int b,c;
        if (a < 10){
            b = 0;
            c=1;
        } else {
            b = -99;
            c = 0;
        }
        System.out.println("B:"+b+" C:"+c);
    }
}
