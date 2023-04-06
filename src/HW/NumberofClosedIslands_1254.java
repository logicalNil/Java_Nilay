package HW;
import java.util.*;


public class NumberofClosedIslands_1254 {
    dfs d = new dfs();
    public int closedIsland(int[][] grid) {
        int count = 0;
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[0].length - 1; j++) {
                if (grid[i][j] == 0) {
                    if (d.dfs(grid, i, j)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1, 1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 1, 0},
                {1, 0, 1, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 0}};
        NumberofClosedIslands_1254 nci = new NumberofClosedIslands_1254();
        System.out.println(nci.closedIsland(grid));
    }


}
