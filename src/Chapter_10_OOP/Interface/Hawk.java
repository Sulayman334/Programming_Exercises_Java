package Chapter_10_OOP.Interface;

public class Hawk implements Predator{
    @Override
    public void hunt() {
        System.out.println("The Hawk is hunting");
    }
}
