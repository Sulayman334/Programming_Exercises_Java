package Chapter_5;

public class FallingDistance {
    public static void main(String[] args) {

        fallingDistance(9.8,10);

        for (int i = 1; i <= 10;i++){

        }
    }

    public static double fallingDistance( double gravity , double amountOfTime){
        double distanceInMetres = (double) 1 /2 *gravity * amountOfTime;
        return distanceInMetres;


    }

}
