package Chapter_3;

import java.util.Scanner;

public class CheckPoint3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of sales");
        double sales = sc.nextDouble();

        if (sales >= 10000){
            double commission = 0.2;
        }else
            System.out.println("Sales must be greater of equal to " + sales);
    }
}
