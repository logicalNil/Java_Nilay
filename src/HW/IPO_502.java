package HW;

import java.util.Arrays;
import java.util.PriorityQueue;

public class IPO_502 {
    public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
        int n = Profits.length;
        int[][] projects = new int[n][2];
        for (int i = 0; i < n; i++) {
            projects[i][0] = Profits[i];
            projects[i][1] = Capital[i];
        }
        Arrays.sort(projects, (a, b) -> a[1] - b[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int i = 0;
        while (k-- > 0) {
            while (i < n && projects[i][1] <= W) {
                pq.offer(projects[i++][0]);
            }
            if (pq.isEmpty()) {
                break;
            }
            W += pq.poll();
        }
        return W;
    }

}
