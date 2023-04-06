package HW;

public class dfs {
    boolean dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return false;
        }
        if (grid[i][j] == 1) {
            return true;
        }
        grid[i][j] = 1;
        boolean up = dfs(grid, i - 1, j);
        boolean down = dfs(grid, i + 1, j);
        boolean left = dfs(grid, i, j - 1);
        boolean right = dfs(grid, i, j + 1);
        return up && down && left && right;
    }

    boolean dfs(int[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return false;
        }
        if (grid[i][j] == 1 || visited[i][j]) {
            return true;
        }
        visited[i][j] = true;
        boolean up = dfs(grid, i - 1, j, visited);
        boolean down = dfs(grid, i + 1, j, visited);
        boolean left = dfs(grid, i, j - 1, visited);
        boolean right = dfs(grid, i, j + 1, visited);
        return up && down && left && right;
    }

    boolean dfs(int[][] grid, int i, int j, boolean[][] visited, int[][] directions) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return false;
        }
        if (grid[i][j] == 1 || visited[i][j]) {
            return true;
        }
        visited[i][j] = true;
        boolean res = true;
        for (int[] dir : directions) {
            res = res && dfs(grid, i + dir[0], j + dir[1], visited, directions);
        }
        return res;
    }

    boolean dfs(int[][][] grid, int i, int j, int k, boolean[][][] visited) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || k < 0 || k >= grid[0][0].length) {
            return false;
        }
        if (grid[i][j][k] == 1 || visited[i][j][k]) {
            return true;
        }
        visited[i][j][k] = true;
        boolean up = dfs(grid, i - 1, j, k, visited);
        boolean down = dfs(grid, i + 1, j, k, visited);
        boolean left = dfs(grid, i, j - 1, k, visited);
        boolean right = dfs(grid, i, j + 1, k, visited);
        boolean front = dfs(grid, i, j, k - 1, visited);
        boolean back = dfs(grid, i, j, k + 1, visited);
        return up && down && left && right && front && back;
    }
}
