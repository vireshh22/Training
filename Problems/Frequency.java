package Problems;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 2, 3, 4, 4, 5, 16, 16 };
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            arr[i] = count;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i])
                System.out.println("\n"+arr[i]);
        }
    }
}