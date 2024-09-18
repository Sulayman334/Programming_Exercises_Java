package Chapter_3_Decision_Structures;

import java.util.Scanner;

public class CheckPoint5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();

        if (x > 100) {
            int y = 20;
            int z = 40;
            System.out.println("y: "+y +" & z: "+ z);
        }

    }
}
