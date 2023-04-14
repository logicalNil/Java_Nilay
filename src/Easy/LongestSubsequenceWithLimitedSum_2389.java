package Easy;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum_2389 {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = nums.length, m = queries.length;
        int ans[] = new int[m];

        for (int i = 0; i < m; ++i) {
            int count = 0;
            int query = queries[i];
            for (int num : nums) {
                if (query >= num) {
                    count++;
                    query -= num;
                }
                else
                    break;
            }
            ans[i] = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        LongestSubsequenceWithLimitedSum_2389 ls = new LongestSubsequenceWithLimitedSum_2389();
        int[] nums = {1, 2, 3, 4, 5};
        int[] queries = {3, 10, 6, 7, 5};
        System.out.println(Arrays.toString(ls.answerQueries(nums, queries)));
    }
}
