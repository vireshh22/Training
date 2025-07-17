package Basics;
public class Largest {
    public static void main(String[] args) {
        int[] arr = { 7, 9, 2, 5, 3 };

        // for(int i=0;i<arr.length;i++){
        // for(int j=i+1;j<arr.length;j++){
        // if(arr[i] < arr[j]){
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // }
        // }
        // }
        // for(int i : arr){
        // System.out.println(i);
        // }

        int largest = arr[0];
        int second = arr[1];
        int third = 0;
        if (second > largest) {
            int temp = second;
            second = largest;
            largest = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest && arr[i] > second) {
                largest = arr[i];
            } 
            if (arr[i] < largest && arr[i] > second) {
                second = arr[i];
            }  
            if (arr[i] > third && arr[i] < largest && arr[i] < second) {
                third = arr[i];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second: " + second);
        System.out.println("Third: " + third);
    }
}
