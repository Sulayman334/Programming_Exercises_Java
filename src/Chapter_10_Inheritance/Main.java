package Chapter_10_Inheritance;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        //myCar.stop();


        Bicycle bike = new Bicycle();
        bike.go();

        System.out.println(bike.speed);
        System.out.println(myCar.speed);;
    }



}
