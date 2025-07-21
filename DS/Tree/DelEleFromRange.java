class DelEleFromRange {

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

    DelEleFromRange() {
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

    boolean search(Node root, int searchEle) {
        boolean found = false;
        if (root == null) {
            return false;
        } else if (searchEle == root.data) {
            found = true;
        } else if (searchEle < root.data) {
            found = search(root.left, searchEle);
        } else if (searchEle > root.data) {
            found = search(root.right, searchEle);
        }
        return found;
    }

    void deleteFromRange(Node root, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (search(root, i)) {
                root = delete(root, i);
            }
        }
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        DelEleFromRange obj = new DelEleFromRange();
        obj.root = obj.insert(obj.root, 10);
        obj.root = obj.insert(obj.root, 20);
        obj.root = obj.insert(obj.root, 15);
        obj.root = obj.insert(obj.root, 25);
        obj.root = obj.insert(obj.root, 40);
        obj.root = obj.insert(obj.root, 5);

        System.out.println();
        obj.deleteFromRange(obj.root,1, 10);

        System.out.println();
        obj.inOrder(obj.root);
    }
}