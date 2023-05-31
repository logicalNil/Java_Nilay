package LeetCode75;

import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of array elements
        int n = scanner.nextInt();

        // Read the array elements
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the contiguous subarray with the largest sum
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < n; i++) {
            currentSum += array[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        // Print the result
        System.out.println("sum: " + maxSum);
        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
