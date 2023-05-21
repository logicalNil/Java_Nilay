public class ShortestBridge_934 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{
            {1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 1, 1}
        };

        System.out.println(solve(grid));
    }

    private static int solve(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][n];

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        Queue<int[]> q = new LinkedList<>();

        // Mark the first island
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    q.add(new int[]{i, j});
                    grid[i][j] = 2;
                    break;
                }
            }
        }

        // BFS
        while (!q.isEmpty()) {
            int[] cur = q.remove();
            int i = cur[0];
            int j = cur[1];

            for (int k = 0; k < 4; k++) {
                int ni = i + dx[k];
                int nj = j + dy[k];

                if (0 <= ni && ni < n && 0 <= nj && nj < n && grid[ni][nj] == 0 && dp[ni][nj] == Integer.MAX_VALUE) {
                    dp[ni][nj] = dp[i][j] + 1;
                    q.add(new int[]{ni, nj});
                }
            }
        }

        return dp[n - 1][n - 1];
    }
}
