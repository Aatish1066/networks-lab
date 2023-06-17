import java.util.*;

class Graph {
    private int V;
    private int[][] matrix;

    Graph(int V) {
        this.V = V;
        matrix = new int[V][V];
    }

    void addEdge(int u, int v, int weight) {
        matrix[u][v] = weight;
        matrix[v][u] = weight;
    }

    void primMST() {
        boolean[] visited = new boolean[V];
        int[] key = new int[V];
        int[] parent = new int[V];

        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);

        key[0] = 0;

        for (int i = 0; i < V - 1; i++) {
            int u = findMinKey(key, visited);
            visited[u] = true;

            for (int v = 0; v < V; v++) {
                if (matrix[u][v] != 0 && !visited[v] && matrix[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = matrix[u][v];
                }
            }
        }

        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i);
        }
    }

    private int findMinKey(int[] key, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < V; i++) {
            if (!visited[i] && key[i] < min) {
                min = key[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 6);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 4, 5);
        graph.addEdge(2, 4, 7);
        graph.addEdge(3, 4, 9);

        graph.primMST();
    }
}

