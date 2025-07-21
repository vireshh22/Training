public class ISbst {

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

    ISbst() {
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

    boolean isBSt(Node root) {
        if (root == null) {
            return false;
        } else if (root.left != null && root.left.data > root.data)
            return false;
        else if (root.right != null && root.right.data < root.data)
            return false;
        else {
            isBSt(root.left);
            isBSt(root.right);
        }
        return true;
    }

    public static void main(String[] args) {
        ISbst obj = new ISbst();
        obj.root = obj.insert(obj.root, 10);
        obj.root = obj.insert(obj.root, 20);
        obj.root = obj.insert(obj.root, 5);
        System.out.println();
        System.out.println(obj.isBSt(obj.root));
    }
}
