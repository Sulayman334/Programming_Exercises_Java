package Chapter_7;
import java.util.ArrayList;
public class ArraylistDemo3 {
    public static void main(String[] args) {


        ArrayList <ArrayList<String>> groceryList = new ArrayList<>();
         ArrayList<String> bakeryList = new ArrayList<String>();
         bakeryList.add("Pasta");
         bakeryList.add("Bread");
         bakeryList.add("Cookies");

         ArrayList<String> produceList = new ArrayList<String>();
         produceList.add("Apples");
         produceList.add("Banana");
         produceList.add("Pineapple");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("Sprite");
        drinksList.add("Vimto");
        drinksList.add("Fanta");

       groceryList.add(bakeryList);
       groceryList.add(drinksList);
       groceryList.add(produceList);

        System.out.println(groceryList.get(1).get(2));



    }
}
