package Chapter_7;

public class Ages2 {
    public static void main(String[] args) {

        int [] ages = {50,23,45,32,12,34,56,67,78,90};

        float average,sum = 0;

        int lowestAge = ages[0];

        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];

            if (ages[i] < lowestAge) {
                lowestAge = ages[i];
            }


        }
        System.out.println("lowest age: " + lowestAge);
    }
}
