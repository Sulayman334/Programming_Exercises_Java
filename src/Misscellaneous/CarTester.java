package Misscellaneous;
import java.util.Scanner;

public class CarTester {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the car brand");
        String brand = keyboard.nextLine();

        System.out.println("Enter the car model");
        String model = keyboard.nextLine();

        System.out.println("Enter the car year");
        int year = keyboard.nextInt();

        Car myCar = new Car(brand,model,year);
        System.out.println(myCar.getBrand());
    }
}
