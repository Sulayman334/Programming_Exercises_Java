package Chapter_10_OOP.Recursion;

public class Factorial {

    public int factorial(int n){
        if (n <= 1){
            return  1;
        }else {
            return n * factorial(n - 1);
        }
    }
}
