package DS.Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Path_Exists {

    HashMap<Integer, LinkedList<Integer>> hm;

    Path_Exists() {
        hm = new HashMap<>();
    }

    void addVertices(int u) {
        hm.put(u, new LinkedList<>());
    }

    void addEdges(int u, int v) {
        addVertices(u);
        addVertices(v);
        hm.get(u).add(v);
        hm.get(v).add(u);
    }

    void dfs(int start, int end) {
        HashSet<Integer> visited = new HashSet<>();
        boolean path = pathExists(start, end, visited);
        if (path) {
            System.out.println("Path exists.");
        } else {
            System.out.println("No path exists.");
        }
    }

    boolean pathExists(int start, int end, HashSet<Integer> visited) {
        if (start == end)
            return true;
        visited.add(start);
        for (int nbr : hm.get(start)) {
            if (!visited.contains(nbr)) {
                if (pathExists(nbr, end, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
