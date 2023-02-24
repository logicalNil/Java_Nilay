package HW;

import java.util.TreeSet;

public class MinimizeDeviationArray_1675 {
    public int minimizeDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int num : nums) {
            if (num % 2 == 1) {
                set.add(num * 2);
            } else {
                set.add(num);
            }
        }
        int minDeviation = set.last() - set.first();
        while (set.last() % 2 == 0) {
            int max = set.pollLast();
            set.add(max / 2);
            minDeviation = Math.min(minDeviation, set.last() - set.first());
        }
        return minDeviation;
    }
    public static void main(String[] args) {
        MinimizeDeviationArray_1675 obj = new MinimizeDeviationArray_1675();
        int[] nums = {4,1,5,20,3};
        System.out.println(obj.minimizeDeviation(nums));
    }
}