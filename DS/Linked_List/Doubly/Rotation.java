import java.util.Scanner;

public class Rotation {

    Node head;
    Node tail;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Rotation() {
        this.head = null;
        this.tail = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void rotateRight(int r) {
        for (int i = 0; i < r; i++) {
            tail.next = head;
            head.prev = tail;
            head = tail;
            tail = tail.prev;
            head.prev = null;
            tail.next = null;
        }
    }

    void rotateLeft(int r) {
        for (int i = 0; i < r; i++) {
            tail.next = head;
            head.prev = tail;
            tail = head;
            head = head.next;
            head.prev = null;
            tail.next = null;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print("<-->" + temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rotation obj = new Rotation();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        while (true) {
            System.out.println("\n1.Right Rotation\n2.Left Rotation\n3.Display");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Rotations:");
                    int rr = sc.nextInt();
                    obj.rotateRight(rr);
                    break;
                case 2:
                    System.out.println("Enter Rotations:");
                    int rl = sc.nextInt();
                    obj.rotateLeft(rl);
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    break;
            }

        }

    }
}
