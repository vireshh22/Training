import java.util.Scanner;

public class P_282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String operation = null;
        int x = 0;
        for (int i = 0; i < n; i++) {
            operation = sc.next();
            if (operation.charAt(0) == '+') {
                ++x;
            } else if (operation.charAt(0) == '-') {
                --x;
            } else if (operation.charAt(operation.length() - 1) == '+') {
                x++;
            } else if (operation.charAt(operation.length() - 1) == '-') {
                x--;
            }
        }
        System.out.println(x);
        sc.close();
    }
}
