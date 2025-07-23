import java.util.Scanner;

public class P_158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int teams = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[teams];
        int count = 0;
        for (int i = 0; i < teams; i++) {
            p[i] = sc.nextInt();
        }

        for (int i = 0; i < teams; i++) {
            if (p[i] >= p[k-1] && p[i] >= 1) {
                count += 1;
            }
        }   
        System.out.println(count);
        sc.close();
    }
}
