package Chapter_4;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        int dailyStoreSales;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter today's sles for 5 stores ");

        for (int i = 1; i <=5; i++){
            System.out.println("Enter sales for store "+i);
            dailyStoreSales = keyboard.nextInt();
        }
    }
}
