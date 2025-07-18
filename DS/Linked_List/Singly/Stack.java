package DS.Linked_List.Singly;

public class Stack {

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

    void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            top = newNode;
        } else {
            Node temp = top;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            top = temp;
        }
    }

    int peek() {
        if (head == null)
            return 0;
        else {
            return top.next.data;
        }
    }

    void pop() {
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

    void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "<--");
                temp = temp.next;
            }
        }
    }

    Stack() {
        this.head = null;
        this.top = null;
    }

    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(10);
        obj.push(20);
        obj.push(40);
        // System.out.println();
        obj.display();
        System.out.println();
        System.out.println("Peek Element: " + obj.peek());
        obj.pop();
        obj.display();
    }
}
