package Searching;

public class Binary_Search_Rec {

    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (arr.length == 1 && arr[0] == target)
            return 0;
        else {
            int middle = (low + high) / 2;
            if (arr[middle] == target)
                return middle;
            else if (arr[middle] > target)
                binarySearch(arr, low, middle - 1, target);
            else
                binarySearch(arr, middle + 1, high, target);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int low = 0;
        int high = arr.length - 1;
        int target = 4;

        int ans = binarySearch(arr, low, high, target);
        if (ans == -1) {
            System.out.println("Element Not Found!");
        } else {
            System.out.println("Element Found At Index: " + ans);
        }

    }
}
