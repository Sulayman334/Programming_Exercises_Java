package Chapter_10_OOP.Interface;

public class Fish implements Prey,Predator{
    @Override
    public void hunt() {
        System.out.println("The fish is hunting the smaller fish");
    }

    @Override
    public void flee() {
        System.out.println("The fish is fleeing from the larger fish");
    }
}
