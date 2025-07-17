package Basics;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String var = sc.next();
        int count = 0;
        for (int i = 0; i < var.length(); i++) {
            if (var.charAt(i) == 'a' || var.charAt(i) == 'A' || var.charAt(i) == 'e' || var.charAt(i) == 'E' || var.charAt(i) == 'i' || var.charAt(i) == 'I' || var.charAt(i) == 'o' || var.charAt(i) == 'O' || var.charAt(i) == 'u' || var.charAt(i) == 'U')
                count += 1;
        }
        System.out.println("Number Of Vowels: " + count);
        sc.close();
    }
}
