package Chapter_7;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Malick");
        list.add("Solo");
        list.add("Ray");
        list.remove("Solo");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
