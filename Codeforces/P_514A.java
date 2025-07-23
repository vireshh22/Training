import java.util.Scanner;

public class P_514A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 10) {
            System.out.println(n);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int temp = n;
        while (temp != 0) {
            int last = temp % 10;
            int inverted = 9 - last;
            if (temp < 10 && last == 9) {
                sb.append(last);
            } else {
                sb.append(Math.min(last, inverted));
            }
            temp /= 10;
        }
        System.out.println(sb.reverse().toString());
    }
}