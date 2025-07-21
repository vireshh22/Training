public class SumOfOdd {

    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    SumOfOdd() {
        this.root = null;
    }

    Node insert(Node root, int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    int sumOdd(Node root) {
        int sum = 0;
        if (root == null) {
            return 0;
        }
        if (root.data % 2 != 0) {
            sum += root.data;
        }
        sum += sumOdd(root.left);
        sum += sumOdd(root.right);
        return sum;
    }

    void printEven(Node root) {
        if (root == null) {
            return;
        }
        if (root.data % 2 == 0) {
            System.out.print(root.data + " ");
        }
        printEven(root.left);
        printEven(root.right);
    }

    void printPrime(Node root) {
        if (root == null) {
            return;
        }
        if (isPrime(root.data)) {
            System.out.println(root.data + " ");
        }
        printPrime(root.left);
        printPrime(root.right);
    }

    boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SumOfOdd obj = new SumOfOdd();
        obj.root = obj.insert(obj.root, 10);
        obj.root = obj.insert(obj.root, 3);
        obj.root = obj.insert(obj.root, 5);
        obj.root = obj.insert(obj.root, 12);
        System.out.println("Odd Number: ");
        System.out.println(obj.sumOdd(obj.root));
        System.out.println("Even Numbers: ");
        obj.printEven(obj.root);
        System.out.println();
        System.out.println("Prime Numbers: ");
        obj.printPrime(obj.root);
    }
}
