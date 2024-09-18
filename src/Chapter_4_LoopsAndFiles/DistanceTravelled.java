package Chapter_4_LoopsAndFiles;

import java.util.Scanner;

public class DistanceTravelled {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the speed of the train in MPH");
        int speed = keyboard.nextInt();

        if (speed <= 0){
            System.out.println("Speed cannot be zero or less");
            System.out.println("Enter a positive integer greater the zero");
            return;

        }

        System.out.println("Enter the number of hours it had travelled");
        int hours = keyboard.nextInt();

        double distance = speed * hours;
        System.out.println("Hours \t\t\t Distance Travelled");
        System.out.println("--------------------------------");

        for (int i = 1; i <= hours; i++){
            System.out.println(i +"\t\t\t"+ i * distance);
        }
    }
}
