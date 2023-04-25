package HW;

import java.util.PriorityQueue;

public class SmallestNumberinInfiniteSet_2336 {

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    public void SmallestInfiniteSet() {
        for(int i = 1; i < 1000; i++) {
            pq.add(i);
        }
    }
    public int popSmallest() {
        if (!pq.isEmpty()) {
            return pq.poll();
        }
        return -1;
    }
    public void addback(int i) {
        if (!pq.contains(i)) {
            pq.add(i);
        }
    }

    public static void main(String[] args) {
    }

}
