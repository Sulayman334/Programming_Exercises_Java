package Chapter_4_LoopsAndFiles;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("bat");
        animals.add("dog");

        for(String i:animals){
            System.out.println(i);
        }
    }
}
