package HW;

public class MinimumCostForTickets_983 {
   public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[n+1];
        for(int i = 0; i < n; ++i) dp[i] = 365*costs[0];

        for(int i = n-1; i >= 0; --i){
            int d7 = i, d30 = i;
            while(d7 < n && days[d7] < days[i] + 7) ++d7;
            while(d30 < n && days[d30] < days[i] + 30) ++d30;
            dp[i] = Math.min(costs[0] + dp[i+1], Math.min(costs[1] + dp[d7], costs[2] + dp[d30]));
        }
        return dp[0];
    }

    public static void main(String[] args) {
        MinimumCostForTickets_983 obj = new MinimumCostForTickets_983();
        int[] days = {1,4,6,7,8,20};
        int[] costs = {2,7,15};
        System.out.println(obj.mincostTickets(days, costs));
    }
}