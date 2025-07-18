public class Practical1 {
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

    Practical1() {
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

    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print("<-->" + temp.data);
                temp = temp.next;
            }
        }
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void deleteElement(int ele) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            if (head.data == ele) {
                head = head.next;
            } else if (tail.data == ele) {
                tail = tail.prev;
                tail.next = null;
            } else {
                Node temp = head;
                while (temp.next != null && temp.next.data != ele) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                temp.next.prev = temp;
            }
        }
    }

    public static void main(String[] args) {
        Practical1 obj = new Practical1();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        System.out.println("Before Deleting Element:");
        obj.display();
        obj.deleteElement(20);
        System.out.println();
        System.out.println("After Deleting Element:");
        obj.display();
    }
}
