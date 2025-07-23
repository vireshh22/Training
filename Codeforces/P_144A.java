import java.util.Scanner;

public class P_144A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] soldires = new int[n];
        for (int i = 0; i < n; i++) {
            soldires[i] = sc.nextInt();
        }

        int max_ind = 0;
        int min_ind = 0;
        for (int i = 1; i < soldires.length; i++) {
            if (soldires[i] > soldires[max_ind]) {
                max_ind = i;
            }
            if (soldires[i] <= soldires[min_ind]) {
                min_ind = i;
            }
        }

        int swaps = max_ind + (n - 1 - min_ind);
        if (max_ind > min_ind)
            swaps--;
        System.out.println(swaps);

        sc.close();
    }
}
