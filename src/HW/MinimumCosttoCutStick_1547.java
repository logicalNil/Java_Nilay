package HW;

import java.util.Arrays;

public class MinimumCosttoCutStick_1547 {
    public int minCost(int n, int[] cuts) {

        int len = cuts.length;

        Arrays.sort(cuts);

        int[] arr = new int[len+2];
        for(int i = 1 ; i <= len ; i++)
            arr[i] = cuts[i-1];

        arr[0] = 0;
        arr[len+1] = n;
        int[][] dp = new int[len+2][len+2];

        for(int i = len ; i >= 1 ; i--){
            for(int j = 1 ; j <= len ; j++)
            {
                if(i > j)   continue;

                int s = Integer.MAX_VALUE;
                for(int k = i ; k <= j ; k++){
                    s = Math.min(arr[j+1]-arr[i-1] + dp[i][k-1] + dp[k+1][j] , s);
                }
                dp[i][j] = s;
            }
        }
        return dp[1][len];
    }

    public static void main(String[] args) {
        MinimumCosttoCutStick_1547 sol = new MinimumCosttoCutStick_1547();
        int n = 7;
        int[] cuts = {1,3,4,5};
        int result = sol.minCost(n, cuts);
        System.out.println(result);
    }
}
