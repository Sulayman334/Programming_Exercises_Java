package Chapter_7_Arrays_Arraylist;

public class Food {
    public static void main(String[] args) {

        Food1[] fridge = new Food1[3];

        Food1 foodie1 = new Food1("Banana");
        Food1 foodie2 = new Food1("Apple");
        Food1 foodie3 = new Food1("Orange");

        fridge [0] = foodie1;
        fridge [1] = foodie2;
        fridge [2] = foodie3;

        for (int i = 0; i < fridge.length; i++) {
            System.out.println(fridge[i].name);
        }




    }
}
