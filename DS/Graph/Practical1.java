package DS.Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Practical1 {

    HashMap<Integer, LinkedList<Integer>> hm;

    Practical1() {
        hm = new HashMap<>();
    }

    void addVertice(int u) {
        hm.putIfAbsent(u, new LinkedList<>());
    }

    void addEdge(int u, int v) {
        addVertice(u);
        addVertice(v);
        hm.get(u).add(v);
        hm.get(v).add(u);
    }

    void display() {
        for (int vertex : hm.keySet()) {
            System.out.print(vertex + " - ");
            for (int nbr : hm.get(vertex)) {
                System.out.print(nbr + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Practical1 obj = new Practical1();
        Scanner sc = new Scanner(System.in);
        int n = 5;
        System.out.println("Add Vertices: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            obj.addVertice(val);
        }

        System.out.println("Add Edges: ");
        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            obj.addEdge(u, v);
        }
        System.out.println();
        obj.display();

        sc.close();
    }
}

// why,when,how,what