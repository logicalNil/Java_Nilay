package HW;

public class New21Game837 {
    public double new21Game(int n, int k, int maxPts) {
        if (k == 0) return 1.0;

        double[] dp = new double[k];

        for (int i = k-1; i >= 0; i--) {
            for (int p = i + 1; p <= i + maxPts; p++) {
                if (p > n) {
                    dp[i] += 0.0;
                } else if (p >= k) {
                    dp[i] += 1.0;
                } else {
                    dp[i] += dp[p];
                }
            }
            dp[i] /= maxPts;
        }
        return dp[0];
    }

    public static void main(String[] args) {
        New21Game837 sol = new New21Game837();
        int N = 21;
        int K = 17;
        int maxPts = 10;
        double result = sol.new21Game(N, K, maxPts);
        System.out.println(result);
    }
}
