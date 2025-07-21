public class SortSentence {
    Node root;

    class Node {
        String data;
        Node left;
        Node right;

        Node(String data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    SortSentence() {
        this.root = null;
    }

    Node insert(Node root, String data) {
        Node newNode = new Node(data);
        if (root == null)
            root = newNode;
        else if (data.compareTo(root.data) < 0) {
            root.left = insert(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
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

    public static void main(String[] args) {
        SortSentence obj = new SortSentence();
        obj.root = obj.insert(obj.root, "i");
        obj.root = obj.insert(obj.root, "am");
        obj.root = obj.insert(obj.root, "viresh");        
        System.out.println();
        obj.inOrder(obj.root);
    }
}
