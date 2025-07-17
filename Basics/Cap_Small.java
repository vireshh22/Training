package Basics;
import java.util.Scanner;

public class Cap_Small {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String toggled = "";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch >= 65 && ch <= 90) {
                toggled += (char)(ch + 32);
            }
            else if (ch >= 97 && ch <= 122) {
                toggled += (char)(ch - 32);
            }
            else {
                toggled += ch;
            }
        }

        System.out.println(toggled);
        sc.close();
    }
}
