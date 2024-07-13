package Chapter_4;

public class CelsiusToFahrenheitTable {
    public static void main(String[] args) {
        final int MAX_CELSIUS = 20;
        double fahrenheits;

        for (int i = 0; i <=MAX_CELSIUS; i++){
            fahrenheits = ((double) (i * 9) /5) + 32;
            System.out.println(i +" °C  :  "+ fahrenheits+ " °F");
        }
    }
}
