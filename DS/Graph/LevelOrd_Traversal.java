package DS.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrd_Traversal {

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

    LevelOrd_Traversal() {
        this.root = null;
    }

    Node addNode(Node root, int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else if (data < root.data) {
            root.left = addNode(root.left, data);
        } else if (data > root.data) {
            root.right = addNode(root.right, data);
        }
        return root;
    }

    void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        System.out.println();
        while (!q.isEmpty()) {
            Node current = q.poll();
            System.out.print(current.data + " ");
            if (current.left != null) {
                q.add(current.left);
            }
            if (current.right != null) {
                q.add(current.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LevelOrd_Traversal obj = new LevelOrd_Traversal();
        obj.root = obj.addNode(obj.root, 50);
        obj.root = obj.addNode(obj.root, 25);
        obj.root = obj.addNode(obj.root, 75);
        obj.root = obj.addNode(obj.root, 10);
        obj.root = obj.addNode(obj.root, 30);
        obj.root = obj.addNode(obj.root, 60);
        obj.root = obj.addNode(obj.root, 90);
        System.out.println();
        obj.levelOrderTraversal(obj.root);
    }
}
