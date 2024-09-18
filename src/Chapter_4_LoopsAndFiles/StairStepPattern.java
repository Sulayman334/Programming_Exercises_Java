package Chapter_4_LoopsAndFiles;
import java.util.Scanner;

public class StairStepPattern {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of steps");
        int numOfSteps = keyboard.nextInt();

        for (int i = 1; i <= numOfSteps; i++){
            for (int j = 1; j <= i;j++){
                System.out.print(" ");
            }
            System.out.println("#");
        }


    }
}
