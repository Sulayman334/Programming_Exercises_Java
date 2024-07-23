package Chapter_5;

import java.util.Scanner;

public class ConversionProgram {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the distance in metres");
        double distanceInMeters = keyboard.nextDouble();
        System.out.println("Press ");
        menu();
        System.out.println("Enter your choice");
        int choice = keyboard.nextInt();

        while (choice != 4){
            switch(choice){
                case 1:
                    showKilometers(distanceInMeters);
                    break;
                case 2:
                    showInches(distanceInMeters);
                    break;
                case 3:
                    showFeet(distanceInMeters);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Press ");
            menu();
            System.out.println("Enter your choice");
            choice = keyboard.nextInt();
        }



    }
    public static void showKilometers(double distanceInMeters) {
        double distanceInKilometers = distanceInMeters * 0.001;
        System.out.println("The distance is " + distanceInKilometers + " kilometers");
    }
    public static void showInches(double distanceInMetres){
        double distanceInInches = distanceInMetres * 39.37;
        System.out.println("The distance is " + distanceInInches + " inches");
    }
    public static void showFeet(double distanceInMetres){
        double distanceInFeet = distanceInMetres * 3.281;
        System.out.println("The distance is " + distanceInFeet + " feet");
    }
    public static void menu ( ) {

        System.out.println("1. Convert to kilometres");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to inches");
        System.out.println("4. Quit the program");

    }
}
