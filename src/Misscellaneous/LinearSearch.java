package Misscellaneous;

public class LinearSearch {
    public static void main(String[] args) {

        int [] array = {2,4,5,6,7,8,9,10,11,12};

       int index = linearSearch(array,12);

       if (index == -1) {
           System.out.println("Invalid index");
       }else {
           System.out.println("Element found at index " + index);
       }




    }

    private static int linearSearch(int[] array,int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
