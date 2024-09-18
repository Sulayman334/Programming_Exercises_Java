package Misscellaneous;

public class Pizza1 {
    public static void main(String[] args) {

        Pizza2 pizza = new Pizza2("Thick Crust","Tomata","Butter","Flour");
        System.out.println("Here are rhe ingredients needed for the pizza");
        System.out.println("Bread: " + pizza.bread);
        System.out.println("Pizza: " + pizza.pizza);
        System.out.println("Cheese: " + pizza.cheese);
        System.out.println("Topping: " + pizza.topping);

    }
}
