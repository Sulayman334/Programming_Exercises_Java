package Chapter_10_OOP.ExceptionHandlingAndFileReader;

public class DivisionCalculator {

    public int divide(int numerator, int denominator){
        int results;
        try {
            results = numerator / denominator;
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero"+ e.getMessage());
            results = -1;
        }
        return results;

    }

}
