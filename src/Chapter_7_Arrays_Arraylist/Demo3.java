package Chapter_7_Arrays_Arraylist;
import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {

        ArrayList <String> NameList = new ArrayList<String>();
        NameList.add("Solo");
        NameList.add("Sully");
        NameList.add("Saul");
        System.out.println(NameList.size());
        System.out.println(NameList);
        System.out.println(NameList.get(1));
        System.out.println("\n");

        for (int i = 0;i < NameList.size();i++){
            System.out.println(NameList.get(i));
        }

    }
}
