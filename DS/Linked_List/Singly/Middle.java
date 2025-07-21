package DS.Linked_List.Singly;

public class Middle {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insert(int data) {
        Node newNode = new Node(data);
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

    // Brute Force
    // int findLength() {
    // int length = 0;
    // if (head == null) {
    // System.out.println("List is empty.");
    // } else {
    // Node temp = head;
    // while (temp != null) {
    // length += 1;
    // temp = temp.next;
    // }
    // }
    // return length;
    // }

    // int findMiddle() {
    // int length = findLength();
    // int middle = length / 2;
    // Node temp = head;
    // while (middle > 0) {
    // temp = temp.next;
    // middle--;
    // }
    // return temp.data;
    // }

    // Optimal approach:

    int getMiddle() {
        Node tortoise = head;
        Node hare = head;
        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        return tortoise.data;
    }

    Middle() {
        this.head = null;
    }

    public static void main(String[] args) {
        Middle obj = new Middle();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        // System.out.println("Middle Of Linked List: " + obj.findMiddle());
        System.out.println("Middle Of LL: " + obj.getMiddle());
    }
}
