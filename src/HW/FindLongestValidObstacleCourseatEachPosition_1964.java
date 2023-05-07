package HW;

public class FindLongestValidObstacleCourseatEachPosition_1964 {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
    int n = obstacles.length;
        int[] dp = new int[n];
        int[] ans = new int[n];

        int len = 0;

        for (int i = 0; i < n; i++) {
            int idx = binarySearch(dp, 0, len - 1, obstacles[i]);

            dp[idx] = obstacles[i];

            if (idx == len) {
                len++;
            }

            ans[i] = idx + 1;
        }

        return ans;
    }

    private int binarySearch(int[] dp, int l, int r, int target) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (dp[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        FindLongestValidObstacleCourseatEachPosition_1964 obj = new FindLongestValidObstacleCourseatEachPosition_1964();
        int[] arr = {3,1,5,6,4,2};
        int[] ans = obj.longestObstacleCourseAtEachPosition(arr);
        for(int i : ans)
            System.out.print(i + " ");
    }
}
