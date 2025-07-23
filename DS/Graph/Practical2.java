package DS.Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Practical2 {

    HashMap<Integer, LinkedList<Integer>> hm;

    Practical2() {
        hm = new HashMap<>();
    }

    void addVertices(int u) {
        hm.putIfAbsent(u, new LinkedList<>());
    }

    void addEdges(int u, int v) {
        addVertices(u);
        addVertices(v);
        hm.get(u).add(v);
        hm.get(v).add(u);
    }

    void delete(int u) {
        hm.get(u).removeAll(hm.get(u));
        hm.remove(u);
        for (int vertex : hm.keySet()) {
            hm.get(vertex).removeIf(nbr -> nbr == u);
        }
    }

    void dfs(int start) {
        HashSet<Integer> visited = new HashSet<>();
        dfsHelper(start, visited);
    }

    void dfsHelper(int start, HashSet<Integer> visited) {
        visited.add(start);
        System.out.println(start);
        for (int nbr : hm.get(start)) {
            if (!visited.contains(nbr)) {
                dfsHelper(nbr, visited);
            }
        }
    }

    void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(start);
        visited.add(start);
        bfsHelper(queue, visited);
    }

    void bfsHelper(Queue<Integer> queue, HashSet<Integer> visited) {

        if (queue.isEmpty())
            return;

        int current = queue.remove();
        System.out.println(current);
        for (int nbr : hm.get(current)) {
            if (!visited.contains(nbr)) {
                queue.add(nbr);
                visited.add(nbr);
            }
        }
        bfsHelper(queue, visited);
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
        Practical2 obj = new Practical2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Vertices: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            obj.addVertices(sc.nextInt());
        }

        // System.out.println("Add Edges: ");
        // for (int i = 0; i < n; i++) {
        //     int u = sc.nextInt();
        //     int v = sc.nextInt();
        //     obj.addEdges(u, v);
        // }
        obj.addEdges(3, 1);
        obj.addEdges(3, 2);
        obj.addEdges(3, 5);
        obj.addEdges(1, 2);
        obj.addEdges(2, 5);
        obj.addEdges(5, 6);
        obj.addEdges(6, 3);

        System.out.println();
        obj.display();

        // System.out.println();
        // obj.delete(3);

        System.out.println();
        obj.display();

        System.out.println();
        System.out.println("Depth First Search: ");
        obj.dfs(3);

        System.out.println();
        System.out.println("Breadth First Search: ");
        obj.bfs(3);

        sc.close();

    }
}

/*
 * 
 * Cycle Detection
 * 
 * Connected Components
 * 
 * Shortest Path (BFS variant for unweighted graph)
 * 
 * Graph Coloring or Bipartite Check
 */