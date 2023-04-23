package HW;

public class RestoreTheArray_1416 {
    public int numberOfArrays(String s, int k) {
        Integer[] dp = new Integer[s.length()];
        return dfs(s, 0, k, dp);
    }
    int dfs(String s, int i, int k, Integer[] dp) {
        if (i == s.length())
            return 1;
        if (s.charAt(i) == '0')
            return 0;
        if (dp[i] != null)
            return dp[i];

        long num = 0;
        int res = 0;
        for (int j = i; j < s.length(); j++)
        {
            num = num * 10 + s.charAt(j) - '0';
            if (num > k)
                break;
            res = (res + dfs(s, j + 1, k, dp)) % 1000000007;
        }
        return dp[i] = res;
    }

    public static void main(String[] args) {
        RestoreTheArray_1416 restoreTheArray_1416 = new RestoreTheArray_1416();
        System.out.println(restoreTheArray_1416.numberOfArrays("1000", 10000));
        System.out.println(restoreTheArray_1416.numberOfArrays("1000", 10));
        System.out.println(restoreTheArray_1416.numberOfArrays("1317", 2000));
        System.out.println(restoreTheArray_1416.numberOfArrays("2020", 30));
        System.out.println(restoreTheArray_1416.numberOfArrays("1234567890", 90));
    }
}
