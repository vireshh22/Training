public class Search {

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

    Search() {
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

    public static void main(String[] args) {
        Search obj = new Search();
        obj.root = obj.insert(obj.root, 10);
        obj.root = obj.insert(obj.root, 3);
        obj.root = obj.insert(obj.root, 7);
        obj.root = obj.insert(obj.root, 12);
        if (obj.search(obj.root, 30)) {
            System.out.println("Element Found!");
        } else {
            System.out.println("Element Not Found In Tree!");
        }
    }
}
