public class Palindrom {

    Node head;
    Node tail;

    class Node {
        int data;
        Node prev = null;
        Node next = null;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Palindrom() {
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

    boolean isPalindrom() {
        if (head == null) {
            System.out.println("List is empty.");
            return false;
        } else {
            Node first = head;
            Node last = tail;

            while (first != last) {
                if (first.data != last.data) {
                    return false;
                }
                first = first.next;
                last = last.prev;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Palindrom obj = new Palindrom();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(1);
        if (obj.isPalindrom()) {
            System.out.println("Palindrom");
        } else {
            System.out.println("It is not palindrom");
        }
    }

}
