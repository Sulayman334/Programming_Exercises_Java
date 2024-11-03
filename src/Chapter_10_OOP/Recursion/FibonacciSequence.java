package Chapter_10_OOP.Recursion;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(fibonacci(2));

    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // 0,1,1,2,3,5,,8,13 ...........................
}
