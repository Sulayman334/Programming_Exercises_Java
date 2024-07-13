package Chapter_5;

public class PassArg {
    public static void main(String[] args) {
        int x = 10;
        displayValue(x);
        displayValue(5);
        displayValue(5*5);
        displayValue(Integer.parseInt("700"));
    }

    public static void displayValue(int num){
        System.out.println("The value of num is "+ num);
    }
}
