package Chapter_4_LoopsAndFiles;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the sales for store 1: ");
        int dailyStoreSales1 = keyboard.nextInt();

        System.out.println("Enter the sales for store 2: ");
        int dailyStoreSales2 = keyboard.nextInt();

        System.out.println("Enter the sales for store 3: ");
        int dailyStoreSales3 = keyboard.nextInt();

        System.out.println("Enter the sales for store 4: ");
        int dailyStoreSales4 = keyboard.nextInt();

        System.out.println("Enter the sales for store 5: ");
        int dailyStoreSales5 = keyboard.nextInt();

        displayAsterisk("Store 1: ", dailyStoreSales1);
        displayAsterisk("Store 2: ",dailyStoreSales2);
        displayAsterisk("Store 3: ",dailyStoreSales3);
        displayAsterisk("Store 4: ",dailyStoreSales4);
        displayAsterisk("Store 5: ",dailyStoreSales5);





    }

    public static void displayAsterisk(String storeName, int sales){
        for (int i = 1; i <= sales/100;i++){
            System.out.print("****");
        }
        System.out.println();
    }
}
