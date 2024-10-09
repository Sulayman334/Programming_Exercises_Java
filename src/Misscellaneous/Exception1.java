package Misscellaneous;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try {
            System.out.println("Enter a whole number to divide ");
            int x = keyboard.nextInt();

            System.out.println("Enter a whole number to divide by");
            int y = keyboard.nextInt();

            int z = x / y;
            System.out.println("Results: " + z);


        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero idiot");
        }
        catch (InputMismatchException e){
            System.out.println("You cannot divide by a string dummy!");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        finally {
            keyboard.close();
        }
    }
}
