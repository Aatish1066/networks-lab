package exp;
import java.util.*;

public class dijkstra {
    public static void dijkstra(int[][] graph, int startVertex) {
        int vertices = graph.length;
        int[] distances = new int[vertices];
        boolean[] visited = new boolean[vertices];

        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[startVertex] = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>(vertices, Comparator.comparingInt(o -> distances[o]));

        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            visited[currentVertex] = true;

            for (int nextVertex = 0; nextVertex < vertices; nextVertex++) {
                int edgeWeight = graph[currentVertex][nextVertex];

                if (edgeWeight > 0 && !visited[nextVertex]) {
                    int newDistance = distances[currentVertex] + edgeWeight;

                    if (newDistance < distances[nextVertex]) {
                        distances[nextVertex] = newDistance;
                        queue.add(nextVertex);
                    }
                }
            }
        }

        System.out.println(Arrays.toString(distances));
    }


}