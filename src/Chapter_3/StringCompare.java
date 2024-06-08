package Chapter_3;

public class StringCompare {
    public static void main(String[] args) {
        String name1 = "Mark";
        String name2 = "Mary";
        String name3 = "Mark";

        if (name1.equals(name3)){
            System.out.println(name1 + " and "+ name3+ " are the same");
        }else {
            System.out.println(name1 + " and "+ name3+ " are not the same");
        }
    }
}
