package HW;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements_347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> counter.get(b) - counter.get(a));
        for (int num : counter.keySet()) {
            heap.offer(num);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        TopKFrequentElements_347 sol = new TopKFrequentElements_347();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] result = sol.topKFrequent(nums, k);
        System.out.println(result);
    }
}
