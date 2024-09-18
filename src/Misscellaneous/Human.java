package Misscellaneous;

public class Human {
    public static void main(String[] args) {

        Human1 human = new Human1("Solo",23,98);
        //System.out.println(human.getName());
        human.setName("Solomon");
        System.out.println(human.getName());
        System.out.println(human.getWeight());
    }
}
