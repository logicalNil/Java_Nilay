package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of array elements
        int N = scanner.nextInt();

        // Read the array elements
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        // Read the number to be multiplied with array elements
        int multiplier = scanner.nextInt();

        // Multiply the array elements by the given number
        for (int i = 0; i < N; i++) {
            array[i] *= multiplier;
        }

        // Sort the array in descending order
        Arrays.sort(array);
        Integer[] descendingArray = new Integer[N];
        for (int i = 0; i < N; i++) {
            descendingArray[i] = array[N - i - 1];
        }

        // Print the result
        for (int i = 0; i < N; i++) {
            System.out.print(descendingArray[i] + " ");
        }
    }
}

