package Chapter_6_Classes;

public class CarClassTest {
    public static void main(String[] args) {

        CarClass myCar = new CarClass(2004,"SULLY CARS",250);
        myCar.accelerate(5);
        myCar.accelerate(5);
        myCar.accelerate(5);
        myCar.accelerate(5);
        myCar.accelerate(5);


        System.out.println(myCar.getSpeed());

        myCar.brake(5);
        myCar.brake(5);
        myCar.brake(5);
        myCar.brake(5);
        myCar.brake(5);

        System.out.println(myCar.getSpeed());
    }
}
