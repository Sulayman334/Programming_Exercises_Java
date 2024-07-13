package Chapter_4;
import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
       int number;
       int largest = Integer.MIN_VALUE;
       int lowest = Integer.MAX_VALUE;

        System.out.println("Enter a series of number(Enter -99 to end):");

        while (true){
            number = keyboard.nextInt();

            if (number == -99){
                break;
            }
            if (number > largest){
                largest = number;
            }
            if (number < lowest){
                lowest = number;
            }
        }

        if (largest == Integer.MIN_VALUE && lowest == Integer.MAX_VALUE){
            System.out.println("No numbers were entered");
        }else {
            System.out.println("Largest: "+ largest);
            System.out.println("Lowest: "+ lowest);
        }

    }
}
