package Chapter_5_Methods;

public class CelsiusTemperatureTable {
    public static void main(String[] args) {

        for (int i = 0;i <=20; i++){
            System.out.println(i +": "+ celsius(i));
        }

    }
    public static double celsius(double fahrenheit) {
        return ((double) 5/9) * (fahrenheit - 32);
    }
}
