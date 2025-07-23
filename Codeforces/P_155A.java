import java.util.Scanner;

public class P_155A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                count += 1;
                max = numbers[i];
            } else if (numbers[i] < min) {
                count += 1;
                min = numbers[i];
            }
        }
        System.out.println(count);
    }
}

// 141A