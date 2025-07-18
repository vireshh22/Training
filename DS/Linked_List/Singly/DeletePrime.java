package DS.Linked_List.Singly;

public class DeletePrime {

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

    void delete() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        while (head != null && isPrime(head.data)) {
            head = head.next;
        }
        if (head == null) {
            System.out.println("All prime numbers have been removed.");
        }
        Node temp = head;
        while (temp.next != null) {
            if (isPrime(temp.next.data)) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

    }

    boolean isPrime(int data) {
        if (data == 0 || data == 1) {
            return false;
        }
        int count = 0;
        for (int i = 2; i <= Math.sqrt(data); i++) {
            if (data % i == 0) {
                count += 1;
            }
        }
        if (count > 0) {
            return false;
        } else {
            return true;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print("->" + temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        DeletePrime obj = new DeletePrime();
        for (int i = 1; i <= 10; i++) {
            obj.insert(i);
        }
        System.out.println("Original Linked List:");
        obj.display();
        System.out.println();
        System.out.println("Linked List After Removing Prime Numbers:");
        obj.delete();
        obj.display();
    }
}
