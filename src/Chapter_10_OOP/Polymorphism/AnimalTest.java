package Chapter_10_OOP.Polymorphism;

public class AnimalTest {
    public static void main(String[] args) {

        Animal animal = new Animal();

        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();
        myCat.sound();
    }
}
