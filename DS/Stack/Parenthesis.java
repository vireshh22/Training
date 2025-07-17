package DS.Stack;

import java.util.Scanner;

public class Parenthesis {

    char[] arr;
    int top;

    Parenthesis(int size) {
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

    char peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return 'x';
        } else {
            // System.out.println(arr[top]);
            return arr[top];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Parenthesis:");
        String parenthesis = sc.next();
        Parenthesis obj = new Parenthesis(parenthesis.length());
        for (int i = 0; i < parenthesis.length(); i++) {
            if (parenthesis.charAt(i) == '{' || parenthesis.charAt(i) == '(' || parenthesis.charAt(i) == '[') {
                obj.push(parenthesis.charAt(i));
            } else if (parenthesis.charAt(i) == '}' && obj.peek() == '{')
                obj.pop();
            else if (parenthesis.charAt(i) == ')' && obj.peek() == '(')
                obj.pop();
            else if (parenthesis.charAt(i) == ']' && parenthesis.charAt(i) == '[')
                obj.pop();
        }
        if (obj.top == -1) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}
