import java.util.Scanner;

public class P_236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int[] arr = new int[26];

        for (int i = 0; i < name.length(); i++) {
            arr[name.charAt(i) - 'a'] += 1;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0)
                count += 1;
        }

        if (count % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
