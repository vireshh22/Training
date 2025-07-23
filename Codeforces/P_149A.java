import java.util.Arrays;
import java.util.Scanner;

class P_149A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] months = new int[12];
        for (int i = 0; i < 12; i++) {
            months[i] = sc.nextInt();
        }
        int count = 0;
        int sum = 0;
        Arrays.sort(months);
        for (int i = months.length - 1; i >= 0; i--) {
            if (sum >= k) {
                break;
            }
            sum += months[i];
            count += 1;
        }
        if (sum >= k)
            System.out.println(count);
        else
            System.out.println(-1);
    }
}