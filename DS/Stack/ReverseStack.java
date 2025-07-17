package DS.Stack;

import java.util.Scanner;

public class ReverseStack {

    char[] arr;
    int top;

    ReverseStack(int size) {
        arr = new char[size];
        top = -1;
    }

    void push(char element) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        } else {
            top++;
            arr[top] = element;
        }
    }

    char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 'x';
        } else {
            // top--;
            return arr[top--];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = sc.next();
        ReverseStack obj = new ReverseStack(name.length());
        for (int i = 0; i < name.length(); i++) {
            obj.push(name.charAt(i));
        }

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(obj.pop());
        }

        sc.close();
    }
}
