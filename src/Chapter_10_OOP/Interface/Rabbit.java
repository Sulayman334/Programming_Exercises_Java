package Chapter_10_OOP.Interface;

public class Rabbit implements Prey{


    @Override
    public void flee() {
        System.out.println("The Rabbit is fleeing");
    }
}
