package HW;

public class UncrossedLines_1035 {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == nums2[0]) {
                dp[i][0] = 1;
            } else if (i > 0) {
                dp[i][0] = dp[i - 1][0];
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] == nums1[0]) {
                dp[0][i] = 1;
            } else if (i > 0) {
                dp[0][i] = dp[0][i - 1];
            }
        }

        for (int i = 1; i < nums1.length; i++) {
            for (int j = 1; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    dp[i][j] = Math.max(dp[i - 1][j - 1] + 1, Math.max(dp[i - 1][j], dp[i][j - 1]));
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }

            }
        }

        return dp[nums1.length - 1][nums2.length - 1];
    }
    public static void main(String[] args) {
        UncrossedLines_1035 obj = new UncrossedLines_1035();
        int[] nums1 = { 1, 4, 2 };
        int[] nums2 = { 1, 2, 4 };
        System.out.println(obj.maxUncrossedLines(nums1, nums2));
    }
}
