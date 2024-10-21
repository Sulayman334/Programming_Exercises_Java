package Chapter_10_OOP.ExceptionHandlingAndFileReader;

public class DivisionCalculatorTester {
    public static void main(String[] args) {

        DivisionCalculator calculator = new DivisionCalculator();
        int result1 = calculator.divide(10,2);
        System.out.println("10/2: "+result1);

        int result2 = calculator.divide(10,0);
        System.out.println("10/0: "+result2);

        int result3 = calculator.divide(25,5);
        System.out.println("25/5: "+result3);
    }
}
