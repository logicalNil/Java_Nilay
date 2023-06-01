package HW;

import java.util.LinkedList;

public class ShortestPathinBinaryMatrix_1901 {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1 || grid[grid.length-1][grid[0].length-1] == 1)
            return -1;

        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,-1},{-1,1},{1,-1}};
        LinkedList<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        int path = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            path++;
            for(int i = 0; i < size; i++){
                int[] current = queue.poll();
                if(current[0] == grid.length-1 && current[1] == grid[0].length-1)
                    return path;
                for(int[] direction : directions){
                    int x = current[0] + direction[0];
                    int y = current[1] + direction[1];
                    if(x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 0){
                        queue.add(new int[]{x,y});
                        grid[x][y] = 1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ShortestPathinBinaryMatrix_1901 obj = new ShortestPathinBinaryMatrix_1901();
        int[][] grid = {{0,0,0},{1,1,0},{1,1,0}};
        System.out.println(obj.shortestPathBinaryMatrix(grid));
    }
}
