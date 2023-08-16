package HW;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        int resultIdx = 0;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            if (i >= k - 1) {
                result[resultIdx++] = nums[deque.peek()];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        SlidingWindowMaximum_239 slidingWindowMaximum_239 = new SlidingWindowMaximum_239();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] result = slidingWindowMaximum_239.maxSlidingWindow(nums, k);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
