package HW;

public class CountSubarraysWithFixedBounds_2444 {
    public int countSubarrays(int[] nums, int minK, int maxK) {
        int i = 0, j = 0, count = 0;
        while (j < nums.length) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            while (j < nums.length && j - i + 1 <= maxK) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                if (min >= minK && max <= maxK) count++;
                j++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountSubarraysWithFixedBounds_2444 obj = new CountSubarraysWithFixedBounds_2444();
        int[] nums = {1, 1, 1, 1};
        int minK = 1, maxK = 1;
        System.out.println(obj.countSubarrays(nums, minK, maxK));
    }
}