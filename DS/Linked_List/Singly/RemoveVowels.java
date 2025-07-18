package DS.Linked_List.Singly;

import java.util.Scanner;

public class RemoveVowels {

    Node head;

    class Node {
        char data;
        Node next = null;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    void insert(char ch) {
        Node newNode = new Node(ch);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            System.out.println("Linked List Of Your Name: ");
            Node temp = head;
            while (temp != null) {
                System.out.print(" -> " + temp.data);
                temp = temp.next;
            }
        }
    }

    void deleteMiddle() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        while (head != null && isVowel(head.data)) {
            head = head.next;
        }

        if (head == null) {
            System.out.println("All characters were vowels.");
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            if (isVowel(temp.next.data)) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

    }

    RemoveVowels() {
        this.head = null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = sc.next().toLowerCase();
        RemoveVowels obj = new RemoveVowels();
        for (int i = 0; i < name.length(); i++) {
            obj.insert(name.charAt(i));
        }
        System.out.println("Original Linked List Of Your Name:");
        obj.display();

        obj.deleteMiddle();
        System.out.println();
        System.out.println("Linked List Of Your Name After Deleting Vowels:");
        obj.display();

        sc.close();
    }

    boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}
