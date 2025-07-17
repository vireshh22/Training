package DS.Stack;

import java.util.Scanner;

public class Practical1 {
    int[] arr;
    int top;

    Practical1(int size) {
        arr = new int[size];
        top = -1;
    }

    void push(int element) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        } else {
            top++;
            arr[top] = element;
        }
    }

    void pop() { // pops the last element not first
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            top--;
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println(arr[top]);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Stack Operations: ");
        Practical1 obj = null;
        int size = 0;
        while (true) {
            System.out.println(
                    "\n1.Create Stack\n2.Is Stack Empty?\n3.Push Element\n4.Pop Element\n5.Peek Element\n6.Display\n7.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Size Of Stack You Want To Create: ");
                    size = sc.nextInt();
                    obj = new Practical1(size);
                    System.out.println("Stack Created Of Size: " + size);
                    break;
                case 2:
                    if (obj == null) {
                        System.out.println("Please Create Stack At First.");
                        return;
                    }
                    if (obj.isEmpty()) {
                        System.out.println("Yes, Stack is empty.");
                    } else {
                        System.out.println("Stack have some elements.");
                    }
                    break;
                case 3:
                    if (obj == null) {
                        System.out.println("Please Create Stack At First.");
                        return;
                    }
                    System.out.println("Enter Element You To Insert: ");
                    int element = sc.nextInt();
                    obj.push(element);
                    break;
                case 4:
                    if (obj == null) {
                        System.out.println("Please Create Stack At First.");
                        return;
                    }
                    obj.pop();
                    System.out.println("Stack Element Popped.");
                    break;
                case 5:
                    if (obj == null) {
                        System.out.println("Please Create Stack At First.");
                        return;
                    }
                    obj.peek();
                    break;
                case 6:
                    if (obj == null) {
                        System.out.println("Please Create Stack At First.");
                        return;
                    }
                    System.out.println("Stack Elements: ");
                    obj.display();
                    break;
                case 7:
                    sc.close();
                    return;
                default:
                    System.out.println("Enter Correct Option.");
                    break;
            }
        }
    }
}
