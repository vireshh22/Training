public class BoundaryTraversal {
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

    BoundaryTraversal() {
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

    void getLeftNodes(Node root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            getLeftNodes(root.left);
            System.out.print(root.data + " ");
        } else if (root.right != null) {
            getLeftNodes(root.right);
            System.out.print(root.data + " ");
        }
        getLeftNodes(root.left);

    }

    void getRightNodes(Node root) {
        if (root == null) {
            return;
        }
        if (root.right != null) {
            getRightNodes(root.right);
            System.out.print(root.data + " ");
        } else if (root.left != null) {
            getRightNodes(root.left);
            System.out.print(root.data + " ");
        }

    }

    void getLeaf(Node root) {
        if (root == null) {
            return;
        }
        getLeaf(root.left);
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }
        getLeaf(root.right);
    }

    public static void main(String[] args) {
        BoundaryTraversal obj = new BoundaryTraversal();
        obj.root = obj.insert(obj.root, 10);
        obj.root = obj.insert(obj.root, 20);
        obj.root = obj.insert(obj.root, 5);
        obj.root = obj.insert(obj.root, 15);
        obj.root = obj.insert(obj.root, 30);
        obj.root = obj.insert(obj.root, 25);
        obj.root = obj.insert(obj.root, 35);

        System.out.println();

        obj.getLeftNodes(obj.root);
        obj.getRightNodes(obj.root);
        obj.getLeaf(obj.root);
    }

}
