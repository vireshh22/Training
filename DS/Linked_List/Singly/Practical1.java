package DS.Linked_List.Singly;

import java.util.Scanner;

public class Practical1 {

    Node head;
    Scanner sc;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    Practical1() {
        this.head = null;
    }

    void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void insertMiddle() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            sc = new Scanner(System.in);
            System.out.println("Enter New Data You Want To Insert: ");
            Node newNode = new Node(sc.nextInt());
            System.out.println("After which element you want to insert " + newNode.data);
            int existing = sc.nextInt();
            Node temp = head;
            while (temp.data != existing) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            sc.close();
        }
    }

    void insert(int data) { // inserts at end
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            System.out.println("List Elements:");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    void deleteMiddle(int data) {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node temp = head;
            if (head.data == data) {
                deleteFront();
            }
            while (temp.next != null && temp.next.data != data) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            sc.close();
        }
    }

    void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    void deleteFront() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head.next;
            head = temp;
        }
    }

    public static void main(String[] args) {
        Practical1 obj = new Practical1();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.display();
        obj.insertMiddle();
        obj.display();
        obj.deleteMiddle(30);
        obj.display();
    }
}
