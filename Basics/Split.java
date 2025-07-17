package Basics;
import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        String[] splitted_string = new String[input.length()];
        int index = 0;
        String word = "";
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.equals("")) {
                    splitted_string[index++] = word;
                    word = "";
                }
            }
        }
        if (!word.equals("")) {
            splitted_string[index++] = word;
        }

        System.out.println("Total words: " + index);
        for (int i = 0; i < index; i++) {
            System.out.println(splitted_string[i]);
        }
        
        sc.close();
    }
}
