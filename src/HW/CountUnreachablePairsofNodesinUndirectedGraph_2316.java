package HW;

import static HW.NumberOperationsMakeNetworkConnected_1319.union;

public class CountUnreachablePairsofNodesinUndirectedGraph_2316 {
    public long countPairs(int n,int[][] edges){
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (int[] edge : edges) {
            union(parent, edge[0], edge[1]);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (parent[i] == i) count++;
        }
        return (long)count * (count - 1) / 2;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] edges = {{0,1},{2,3}};
        System.out.println(new CountUnreachablePairsofNodesinUndirectedGraph_2316().countPairs(n, edges));
    }
}
