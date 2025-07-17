package DS.Stack;

import java.util.Scanner;

public class ReverseSentence {

    String[] arr;
    int top;

    ReverseSentence(int size) {
        arr = new String[size];
        top = -1;
    }

    void push(String element) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        } else {
            top++;
            arr[top] = element;
        }
    }

    String pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return "-1";
        } else {
            // top--;
            return arr[top--];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Sentence");
        String sentence = sc.next();
        ReverseSentence obj = new ReverseSentence(sentence.length());
        for (int i = 0; i < sentence.length(); i++) {
            String word = new String();
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == 32)
                    continue;
                else
                    word += sentence.charAt(j);
            }
            obj.push(word);
        }

        for (int i = obj.top; i >= 0; i--) {
            System.out.print(obj.pop());
        }

        sc.close();
    }
}
