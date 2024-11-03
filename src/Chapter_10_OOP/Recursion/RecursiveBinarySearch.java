package Chapter_10_OOP.Recursion;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 13;

        int index = binarySearch(arr, 0, arr.length - 1, target);

        if (index == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index: " + index);
        }

    }

    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, right, target);
        } else {
            return binarySearch(arr, left, mid - 1, target);
        }
    }
}
