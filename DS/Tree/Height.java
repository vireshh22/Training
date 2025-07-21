public class Height {
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

    Height() {
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

    int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        return Math.max(lh, rh) + 1;
    }

    int getLevel(Node root) {
        if (root == null) {
            return 0;
        }
        int left = getLevel(root.left);
        int right = getLevel(root.right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        Height obj = new Height();
        // for (int i = 11; i <= 30; i++) {
        //     obj.root = obj.insert(obj.root, i);
        // }
        obj.root = obj.insert(obj.root, 10);
        obj.root = obj.insert(obj.root, 20);
        obj.root = obj.insert(obj.root, 5);
        obj.root = obj.insert(obj.root, 25);
        obj.root = obj.insert(obj.root, 40);

        System.out.println();
        System.out.println(obj.getHeight(obj.root));
        System.out.println();
        System.out.println(obj.getLevel(obj.root));
    }
}
