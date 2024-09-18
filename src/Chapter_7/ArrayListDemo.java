package Chapter_7;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {


        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Sharma");
        food.add("Chicken");

        food.set(0,"Cake");
        food.remove(2);
        food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println("Item at index " + i + ": " + food.get(i));
        }
    }
}
