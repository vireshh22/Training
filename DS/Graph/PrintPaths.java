package DS.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrintPaths {

    HashMap<Integer, LinkedList<Integer>> hm;

    PrintPaths() {
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

    void printPath(int start, int end) {
        List<Integer> path = new ArrayList<>();
        HashSet<Integer> visited = new HashSet<>();
        System.out.println("Path From " + start + "-" + end);
        printPathHelper(start, end, path, visited);
    }

    void printPathHelper(int start, int end, List<Integer> path, HashSet<Integer> visited) {
        path.add(start);
        visited.add(start);
        if (start == end) {
            System.out.println(path);
        } else {
            for (int nbr : hm.get(start)) {
                if (!visited.contains(nbr)) {
                    printPathHelper(nbr, end, path, visited);
                }
            }
        }
        path.remove(path.size() - 1);
        visited.remove(start);
    }

    void path(int start, int end, String result) {
        if (start == end) {
            System.out.println(result + end);
        }
        result += start + " ";
        for (int nbr : hm.get(start)) {
            path(nbr, end, result);
        }
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
        PrintPaths obj = new PrintPaths();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Vertices: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            obj.addVertices(sc.nextInt());
        }

        obj.addEdges(1, 2);
        obj.addEdges(1, 3);
        obj.addEdges(2, 4);
        obj.addEdges(3, 4);
        obj.addEdges(2, 5);
        obj.addEdges(5, 4);

        System.out.println();
        obj.display();
        System.out.println();
        obj.printPath(1, 4);

        // System.out.println();
        // obj.path(1, 4, "");

        sc.close();
    }
}
