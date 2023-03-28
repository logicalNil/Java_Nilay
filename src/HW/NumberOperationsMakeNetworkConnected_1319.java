package HW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberOperationsMakeNetworkConnected_1319 {
    long ans= 0;
    Map<Integer, List<Integer>> map = new HashMap<>();
    Set<Integer> visited = new HashSet<>();
    private void dfs(int i) {
            visited.add(i);
            List<Integer> list = map.get(i);
            for (int j = 0; j < list.size(); j++) {
                if (!visited.contains(list.get(j))) {
                    continue;
                }
                dfs(list.get(j));
            }
    }
    private void constructMap(int n, int[][] connections) {
        for (int i = 0; i < n; i++) {
            map.put(i, new List<Integer>());
        }
        for (int i = 0; i < connections.length; i++) {
            map.get(connections[i][0]).add(connections[i][1]);
            map.get(connections[i][1]).add(connections[i][0]);
        }
    }
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;
        }
        constructMap(n, connections);
        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                dfs(i);
                ans++;
            }
        }
        return (int) ans - 1;
    }

    public static void main(String[] args) {
        NumberOperationsMakeNetworkConnected_1319 obj = new NumberOperationsMakeNetworkConnected_1319();
        int[][] connections = {{0,1},{0,2},{1,2}};
        System.out.println(obj.makeConnected(4, connections));
    }
}

