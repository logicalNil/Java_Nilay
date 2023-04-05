package HW;

public class MinimizeMaximumArray_2439 {
    public int minimizeArrayValue(int[] nums) {
    long sum = 0;
        long res = 0;
        for (int i = 0; i< nums.length; ++i) {
            sum += nums[i];
            res = Math.max(res, (sum + i) / (i + 1));
        }
        return (int) res;
    }

    public static void main(String[] args) {
        int[] nums = {5, 6, 8, 9, 2};
        MinimizeMaximumArray_2439 mma = new MinimizeMaximumArray_2439();
        System.out.println(mma.minimizeArrayValue(nums));
    }
}
