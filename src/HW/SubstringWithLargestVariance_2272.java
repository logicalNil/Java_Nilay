package HW;

import java.util.Arrays;

public class SubstringWithLargestVariance_2272 {
    public int largestVariance(String s) {
        int ans = 0;
        int[][] dp = new int[26][26];
        int[][] dp1 = new int [26][26];
        for(int i = 0; i < 26; i++){
            Arrays.fill(dp1[i], -s.length());
        }

        for(int j = 0; j < s.length(); j++){
            int ch = s.charAt(j) - 'a';
            for(int k = 0; k < 26; k++){
                if(k == ch) continue;
                ++dp[ch][k];
                ++dp1[ch][k];
                dp1[k][ch] = --dp[k][ch];
                dp[k][ch] = Math.max(dp[k][ch], 0);
                ans = Math.max(ans, Math.max(dp1[ch][k], dp1[k][ch]));

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        SubstringWithLargestVariance_2272 obj = new SubstringWithLargestVariance_2272();
        System.out.println(obj.largestVariance("ababab"));
    }
}
