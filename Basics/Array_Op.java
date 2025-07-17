package Basics;
import java.util.Scanner;

public class Array_Op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Operations: ");
        System.out.println("Enter Size Of An Array To Be Created: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        while (true) {
            System.out.println("1.Add Array\n2.Display\n3.Deleted\n4.Update\n5.Break");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter " + n + " Elements:");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    for (int i : arr)
                        System.out.println(i);
                    break;
                case 3:
                    System.out.println("Enter Element To Be Deleted: ");
                    int ele = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == ele) {
                            found = true;
                            for (int j = i; j < arr.length - 1; j++) {
                                arr[j] = arr[j + 1];
                            }
                            arr[arr.length - 1] = 0;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element Not Found!");
                    }
                    break;
                case 4:
                    System.out.println("Enter Element To Be Updated: ");
                    int up = sc.nextInt();
                    boolean updated = false;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == up) {
                            System.out.println("Enter New Element: ");
                            int new_ele = sc.nextInt();
                            arr[i] = new_ele;
                            updated = true;
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Element To Be Updated Not Found!");
                        break;
                    }
                    break;

                case 5:
                    break;
                default:
                    System.out.println("Enter Correct Number..");
                    break;
            }
        }
    }
}
