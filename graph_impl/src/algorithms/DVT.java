package algorithms;
import java.util.Arrays;

public class DVT {

    private static final int INF = Integer.MAX_VALUE / 2;

    public static void main(String[] args) {

        // Define the graph as an adjacency matrix
        int[][] graph = {
                {0, 1, 3, INF},
                {1, 0, 1, 4},
                {3, 1, 0, 1},
                {INF, 4, 1, 0}
        };

        // Initialize the distance vector and next-hop vector for each node
        int[][] distVector = Arrays.copyOf(graph, graph.length);
        int[][] nextHopVector = new int[graph.length][graph.length];

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                nextHopVector[i][j] = j;
            }
        }

        // Run the Distance Vector Routing algorithm
        for (int k = 0; k < graph.length; k++) {
            for (int i = 0; i < graph.length; i++) {
                for (int j = 0; j < graph.length; j++) {
                    if (distVector[i][k] + distVector[k][j] < distVector[i][j]) {
                        distVector[i][j] = distVector[i][k] + distVector[k][j];
                        nextHopVector[i][j] = nextHopVector[i][k];
                    }
                }
            }
        }

        // Print the distance vector and next-hop vector for each node
        for (int i = 0; i < graph.length; i++) {
            System.out.println("Node " + i + ":");
            for (int j = 0; j < graph.length; j++) {
                if (i == j) {
                    System.out.println("\tDistance to self: 0");
                    continue;
                }
                System.out.println("\tDistance to node " + j + ": " + distVector[i][j]);
                System.out.println("\tNext hop to node " + j + ": " + nextHopVector[i][j]);
            }
        }
    }
}

