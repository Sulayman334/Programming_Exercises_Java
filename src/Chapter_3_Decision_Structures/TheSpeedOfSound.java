package Chapter_3_Decision_Structures;

import java.util.Objects;
import java.util.Scanner;

public class TheSpeedOfSound {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the medium (air, water or steel)");
        String medium = keyboard.nextLine();

        System.out.println("Enter the distance "+ medium+ " travels");
        double distance = keyboard.nextInt();

        double amountOfTimeInAir,amountOfTimeInWater, amountOfTimeInSteel;

        if (Objects.equals(medium, "air")) {
            amountOfTimeInAir = distance /1100;
            System.out.println(amountOfTimeInAir);
        } else
            if (Objects.equals(medium,"water")) {
            amountOfTimeInWater = distance /4900;
                System.out.println(amountOfTimeInWater);
        }else
            if (Objects.equals(medium,"steel")){
                amountOfTimeInSteel = distance /16900;
                System.out.println(amountOfTimeInSteel);
            }
    }
}
