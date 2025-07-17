package Problems;

public class Move_Zeroes {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 5, 0, 2, 3, 0, 0 };
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index += 1;
            }
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
        System.out.println();
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
