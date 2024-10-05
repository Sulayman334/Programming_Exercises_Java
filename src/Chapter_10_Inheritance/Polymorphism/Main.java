package Chapter_10_Inheritance.Polymorphism;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle [] racers = {bicycle, boat,car};

       for (Vehicle x : racers) {
           x.go();
       }
    }
}
