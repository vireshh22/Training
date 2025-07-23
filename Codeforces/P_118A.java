import java.util.Scanner;

public class P_118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String sb = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A' || input.charAt(i) == 'E' || input.charAt(i) == 'I' || input.charAt(i) == 'O'
                    || input.charAt(i) == 'U' || input.charAt(i) == 'Y' || input.charAt(i) == 'a'
                    || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u' || input.charAt(i) == 'y') {
                continue;
            }
            sb += ('.');
            sb += input.charAt(i);
        }

        System.out.println(sb.toLowerCase());
        sc.close();

    }
}
