package Chapter_5_Methods;

public class EvenOddCounter {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (isEven(i)) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
    public static boolean isEven(int counter){
        if (counter % 2 ==0){
            return true;
        }
        return false;
    }
}
