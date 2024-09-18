package Chapter_9;

public class RegionMatches {
    public static void main(String[] args) {

        String str = "Four score and seven years ago";
        String str2 = "Those seven years passed quickly";

        if (str.regionMatches(15,str2,6,11)){
            System.out.println("This region matches");
        }else {
            System.out.println("They didn't match");
        }
    }
}
