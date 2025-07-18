package DS.Linked_List.Singly;

public class Queue {

    Node head;
    Node top;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void enqueue(int data) {
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

    void dequeue() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node temp = head.next;
            head = temp;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print("<--" + temp.data);
                temp = temp.next;
            }
        }
    }

    Queue() {
        this.head = null;
    }

    public static void main(String[] args) {
        Queue obj = new Queue();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.display();
        obj.dequeue();
        System.out.println();
        obj.display();
    }

}
