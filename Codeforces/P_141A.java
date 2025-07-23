import java.util.Scanner;

public class P_141A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String guest = sc.next();
        String host = sc.next();
        String gh = sc.next();

        int[] gha = new int[26];
        int[] gharr = new int[26];

        for (int i = 0; i < guest.length(); i++) {
            gha[guest.charAt(i) - 'A'] += 1;
        }

        for (int j = 0; j < host.length(); j++) {
            gha[host.charAt(j) - 'A'] += 1;
        }

        for (int j = 0; j < gh.length(); j++) {
            gharr[gh.charAt(j) - 'A'] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if (gharr[i] != gha[i]) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
        sc.close();

    }

}
