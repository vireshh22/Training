package Basics;
import java.util.Scanner;

public class Count_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int count = 0;
        boolean inWord = false;

        for(int i = 0; i < sentence.length(); i++){
            char ch = sentence.charAt(i);
            if(ch != ' '){
                if(!inWord){
                    count++; 
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
