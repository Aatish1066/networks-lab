package exp;

public class prism {

    public static int[] primMST(int[][] graph) {
        int n = graph.length;
        int[] parent = new int[n];
        int[] key = new int[n];
        boolean[] mstSet = new boolean[n];

        for (int i = 0; i < n; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        key[0] = 0;
        parent[0] = -1;

        for (int i = 0; i < n - 1; i++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;

            for (int v = 0; v < n; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
            System.out.println(parent[i]+" "+key[i]);
        }

        return parent;
    }

    public static int minKey(int[] key, boolean[] mstSet) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int i = 0; i < key.length; i++) {
            if (!mstSet[i] && key[i] < min) {
                min = key[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}

