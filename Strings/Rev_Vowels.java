package Strings;

import java.util.Scanner;

public class Rev_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toLowerCase();
        System.out.println("Original: " + input);

        int i = 0;
        int j = input.length() - 1;

        char[] arr = input.toCharArray();
        while (i < j) {
            if (isVowel(arr[i]) && isVowel(arr[j])) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else {
                if (!isVowel(arr[i]))
                    i++;
                if (!isVowel(arr[j]))
                    j--;
            }
        }

        System.out.println("Reversed: " + new String(arr));
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
