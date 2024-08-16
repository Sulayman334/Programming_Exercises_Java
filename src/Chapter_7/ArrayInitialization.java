package Chapter_7;

public class ArrayInitialization {
    public static void main(String[] args) {

        int [] days = {31, 28, 31, 30, 31, 30, 10, 31, 30, 31, 30, 31};

        for (int i = 0; i < days.length; i++) {
            System.out.println("Month " + (i+1) + "   : " + days[i]);
        }
    }
}
