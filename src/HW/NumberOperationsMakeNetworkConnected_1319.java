package HW;

public class NumberOperationsMakeNetworkConnected_1319 {
    public static void main(String[] args) {
        int n = 4;
        int[][] connections = {{0,1},{0,2},{1,2}};
        System.out.println(makeConnected(n, connections));
    }

    public static int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) return -1;
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (int[] connection : connections) {
            union(parent, connection[0], connection[1]);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (parent[i] == i) count++;
        }
        return count - 1;
    }

    static void union(int[] parent, int i, int j) {
        int rootI = find(parent, i);
        int rootJ = find(parent, j);
        if (rootI != rootJ) {
            parent[rootI] = rootJ;
        }
    }

    private static int find(int[] parent, int i) {
        if (parent[i] != i) {
            parent[i] = find(parent, parent[i]);
        }
        return parent[i];
    }
}

