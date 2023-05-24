package HW;

public class MaximumSubsequenceScore_2542 {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int[] sum1 = new int[nums1.length + 1];
        int[] sum2 = new int[nums2.length + 1];
        for (int i = 1; i <= nums1.length; i++) {
            sum1[i] = sum1[i - 1] + nums1[i - 1];
        }
        for (int i = 1; i <= nums2.length; i++) {
            sum2[i] = sum2[i - 1] + nums2[i - 1];
        }

        long result = 0;
        for (int i = 0; i <= k; i++) {
            result = Math.max(result, sum1[i] + sum2[k - i]);
        }

        return result;

    }

    public static void main(String[] args) {
        MaximumSubsequenceScore_2542 sol = new MaximumSubsequenceScore_2542();
        int[] nums1 = {1, 3, 3, 2};
        int[] nums2 = {2, 1, 3, 4};
        int k = 3;
        long result = sol.maxScore(nums1, nums2, k);
        System.out.println(result);
    }
}
