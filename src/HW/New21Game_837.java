package HW;

//Time Complexity Exceded
public class New21Game_837 {
    public double new21Game(int n , int k, int maxPts) {
        if (k == 0) {
            return 1;
        }
        int max = k + maxPts - 1;
        double[] dp = new double[max + 1];
        dp[0] = 1;
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= maxPts; j++) {
                if (i - j >= 0 && i - j < k) {
                    dp[i] += dp[i - j] / maxPts;
                }
            }
        }
        double result = 0;
        for (int i = k; i <= n; i++) {
            result += dp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        New21Game_837 sol = new New21Game_837();
        int n = 21;
        int k = 17;
        int maxPts = 10;
        double result = sol.new21Game(n, k, maxPts);
        System.out.println(result);
    }
}
