package LeetCode75;

public class FindPivotIndex_724 {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        FindPivotIndex_724 obj = new FindPivotIndex_724();
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(obj.pivotIndex(nums));
    }
}
