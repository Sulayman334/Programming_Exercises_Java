package Chapter_3_Decision_Structures;

public class StringCompareTo {
    public static void main(String[] args) {

        String name = "Mary";
        String name1 = "Mark";

        if (name.compareTo(name1) < 0){
            System.out.println(name + " is less than " + name1);
        } else
            if (name.compareTo(name1) == 0){
                System.out.println(name + " is equal to " + name1);
            }else
                if (name.compareTo(name1) > 0){
                    System.out.println(name + " is greater than " + name1);

                }
    }
}
