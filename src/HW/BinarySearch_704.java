package HW;

public class BinarySearch_704 {
    public int search(int[] nums, int target) {
    int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target)
                r = mid;
            else
                l = mid + 1;
        }

        if (nums[l] != target) return -1;
        return l;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        BinarySearch_704 bs = new BinarySearch_704();
        System.out.println(bs.search(nums, target));
    }
}
