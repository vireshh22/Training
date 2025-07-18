public class Size {

    Node head;
    Node tail;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.prev = null;
            this.next = null;
        }
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

    int countSize() {
        int count = 0;
        if (head == null) {
            System.out.println("List is empty.");
            return count;
        } else {
            Node left = head;
            Node right = tail;
            while (left != right) {
                count++;
                left = left.next;
                right = right.prev;
            }
            if (head == tail)
                count += 1;
        }
        return count;
    }

    Size() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        Size obj = new Size();
        obj.insert(10);
        obj.insert(20);
        System.out.println("Size of LL: " + obj.countSize());
    }
}
