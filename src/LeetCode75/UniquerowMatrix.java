package LeetCode75;

import java.util.Scanner;

public class UniquerowMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of rows and columns
        int numRows = scanner.nextInt();
        int numCols = scanner.nextInt();

        // Read the binary matrix
        int[][] matrix = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Check if rows can be made unique by removing a single column
        boolean canMakeUnique = true;

        // Iterate through each column
        for (int col = 0; col < numCols; col++) {
            boolean[] rowSet = new boolean[numRows];

            // Iterate through each row
            for (int row = 0; row < numRows; row++) {
                int numOnes = 0;
                int numZeros = 0;

                // Count the number of ones and zeros in the row
                for (int c = 0; c < numCols; c++) {
                    if (c == col) {
                        continue; // Skip the column being removed
                    }

                    if (matrix[row][c] == 1) {
                        numOnes++;
                    } else {
                        numZeros++;
                    }
                }

                // Check if the row has already occurred
                if (numOnes > 0 && numZeros > 0) {
                    rowSet[row] = true;
                }
            }

            // Check if any row is repeated
            for (boolean occurred : rowSet) {
                if (occurred) {
                    canMakeUnique = false;
                    break;
                }
            }

            if (!canMakeUnique) {
                break;
            }
        }

        // Print the result
        if (canMakeUnique) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
