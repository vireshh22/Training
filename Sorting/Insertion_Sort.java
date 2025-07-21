package Sorting;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 2, 4, 1, 9 };
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        for (int i : arr)
            System.out.print(i + " ");
    }
}
