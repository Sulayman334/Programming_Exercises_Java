package Chapter_10_OOP.ZooManagementSystem;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Eagle("Buddy",22));
        animals.add(new Elephant("Simba",24));
        animals.add(new Fish("Prawn",14));

        for (Animal animal : animals) {

           animal.makeSound();
            animal.move();

        }




    }
}
