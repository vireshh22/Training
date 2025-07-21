public class Practical2 {
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

    Practical2() {
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

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Practical2 obj = new Practical2();
        obj.root = obj.insert(obj.root, 2);
        obj.root = obj.insert(obj.root, 10);
        obj.root = obj.insert(obj.root, 7);
        obj.root = obj.insert(obj.root, 13);
        System.out.println();
        System.out.println("In Order: ");
        obj.inOrder(obj.root);
        System.out.println();
        System.out.println("Pre Order: ");
        obj.preOrder(obj.root);
        System.out.println();
        System.out.println("Post Order: ");
        obj.postOrder(obj.root);
    }

}
