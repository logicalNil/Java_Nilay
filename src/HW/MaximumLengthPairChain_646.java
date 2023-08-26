package HW;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthPairChain_646 {
    public int findLongestChain(int[][] pairs) {
       Arrays.sort(pairs,new Comparator<int[]>(){
            public int compare(int[] row1, int[] row2) {
                return Integer.compare(row1[1], row2[1]);
            }
        });
        int end = Integer.MIN_VALUE;
        int count = 0;
        for(int[] arr : pairs)
        {
            if(arr[0] > end)
            {
                end = arr[1];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        MaximumLengthPairChain_646 maximumLengthPairChain_646 = new MaximumLengthPairChain_646();
        int[][] pairs = {{1,2},{2,3},{3,4}};
        System.out.println(maximumLengthPairChain_646.findLongestChain(pairs));
    }
}
