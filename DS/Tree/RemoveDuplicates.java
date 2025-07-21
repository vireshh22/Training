public class RemoveDuplicates {
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

    RemoveDuplicates() {
        this.root = null;
    }

    Node insert(Node root, int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else if (data <= root.data) {
            root.left = insert(root.left, data);
        } else if (data >= root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    Node delete(Node root, int data) {
        if (root == null) {
            return null;
        } else if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                root.data = minimum(root.right);
                root.right = delete(root.right, data);
            }
        }
        return root;
    }

    int minimum(Node root) {
        int mini = root.data;
        while (root.left != null) {
            mini = root.left.data;
            root = root.left;
        }
        return mini;
    }

    public static void main(String[] args) {
        RemoveDuplicates obj = new RemoveDuplicates();
        for (int i = 11; i <= 40; i += 3) {
            obj.root = obj.insert(obj.root, i);
        }
        for (int i = 11; i <= 20; i++) {
            obj.root = obj.insert(obj.root, i);
        }

        obj.inorder(obj.root);

    }
}
