package Chapter_7_Arrays_Arraylist;

public class SearchArray {
    public static void main(String[] args) {
        int  [] test = {87, 75, 98, 100, 82};
        int results;

        results = sequentialSearch(test, 100);

        if (results == -1) {
            System.out.println("You did not earn 100 on any test");
        }else {
            System.out.println("You earned 100 on test " + (results+1));
        }
    }

    public static int sequentialSearch( int [] array,int value){
        int index =0;
        int element = -1;
        boolean found = false;

        while (!found && index < array.length) {
            if (array[index] == value) {
                found = true;
                element = index;
            }
            index++;
        }
        return element;
    }



}
