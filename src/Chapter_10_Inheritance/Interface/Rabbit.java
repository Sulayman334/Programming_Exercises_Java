package Chapter_10_Inheritance.Interface;

public class Rabbit implements Prey{


    @Override
    public void flee() {
        System.out.println("The Rabbit is fleeing");
    }
}
