package LeetCode75;

public class RunningSum_1480 {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        RunningSum_1480 obj = new RunningSum_1480();
        int[] nums = {1, 2, 3, 4};
        int[] result = obj.runningSum(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
