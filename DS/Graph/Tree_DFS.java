package DS.Graph;

import java.util.Stack;

public class Tree_DFS {

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

    Tree_DFS() {
        this.root = null;
    }

    Node insert(Node root, int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    void dfs(Node root) {
        Stack<Node> s = new Stack<>();
        s.add(root);
        while (!s.isEmpty()) {
            Node current = s.pop();
            System.out.println(current.data + " ");
            if (current.right != null) {
                s.push(current.right);
            }
            if (current.left != null) {
                s.push(current.left);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Tree_DFS obj = new Tree_DFS();
        obj.root = obj.insert(obj.root, 50);
        obj.root = obj.insert(obj.root, 25);
        obj.root = obj.insert(obj.root, 75);
        obj.root = obj.insert(obj.root, 10);
        obj.root = obj.insert(obj.root, 30);
        obj.root = obj.insert(obj.root, 60);
        obj.root = obj.insert(obj.root, 90);
        System.out.println();
        obj.dfs(obj.root);
    }

}
