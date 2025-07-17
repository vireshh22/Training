package Basics;
import java.util.Scanner;

public class Num_Chars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int len = 0;
        input.length();
        for(int i = 0; ;){
            if(input.charAt(i) == '#'){
                System.out.println(len);
                return ;
            }
            if(input.charAt(i) != '#') len+=1;
            i++;
        }
    }
}
