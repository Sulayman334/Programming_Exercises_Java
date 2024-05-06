package Chapter_3;

import java.util.Scanner;

public class CheckPoint2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hours");
        int hours = sc.nextInt();

        System.out.println("Enter the payRate");
        double payRate = sc.nextDouble();

        if (hours > 40){
            double v = 1.5 * payRate;
            System.out.println(v);
        }else
            System.out.println("Hours is not 40");
    }
}
