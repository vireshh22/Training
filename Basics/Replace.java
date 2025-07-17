package Basics;
import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();  
        String replace_with = sc.next(); 
        String new_word = sc.next();

        String result = "";
        int i = 0;

        while (i < input.length()) {
            boolean match = true;

            if (i + replace_with.length() <= input.length()) {
                for (int j = 0; j < replace_with.length(); j++) {
                    if (input.charAt(i + j) != replace_with.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    result += new_word;
                    i += replace_with.length();
                    continue;
                }
            }

            result += input.charAt(i);
            i++;
        }

        System.out.println(result);
        sc.close();
    }
}
