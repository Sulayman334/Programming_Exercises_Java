package Chapter_3;

import java.util.Scanner;

public class CheckPoint10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of sales: ");
        double sales = sc.nextDouble();
        double commission;

        if (sales >= 50000.0){
            commission = 0.10;
        }else {
            commission = 0.2;
        }
        System.out.println(commission);
    }
}
