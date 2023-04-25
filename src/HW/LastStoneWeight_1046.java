package HW;

public class LastStoneWeight_1046 {
    public int lastStoneWeight(int[] stones) {
        int[] dp = new int[3001];
        for (int i = 0; i < stones.length; i++)
            dp[stones[i]]++;
        int i = 3000;
        while (i > 0)
        {
            if (dp[i] == 0)
            {
                i--;
                continue;
            }
            dp[i]--;
            int j = i - 1;
            while (j > 0 && dp[j] == 0)
                j--;
            if (j == 0)
                return i;
            dp[i - j]++;
            i = i - 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        LastStoneWeight_1046 lastStoneWeight_1046 = new LastStoneWeight_1046();
        System.out.println(lastStoneWeight_1046.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }
}

