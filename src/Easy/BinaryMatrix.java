package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class BinaryMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of rows and columns
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        // Read the binary matrix
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Check if rows can be made unique by removing a single column
        boolean canMakeUnique = true;
        for (int i = 0; i < columns; i++) {
            // Remove the i-th column from the matrix
            int[][] modifiedMatrix = removeColumn(matrix, i);

            // Check if the modified matrix has duplicate rows
            if (!hasUniqueRows(modifiedMatrix)) {
                canMakeUnique = false;
                break;
            }
        }

        // Print the result
        System.out.println(canMakeUnique ? "Yes" : "No");
    }

    // Method to remove a column from a matrix
    private static int[][] removeColumn(int[][] matrix, int columnIndex) {
        int rows = matrix.length;
        int columns = matrix[0].length - 1;

        int[][] modifiedMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0, k = 0; j < columns + 1; j++) {
                if (j != columnIndex) {
                    modifiedMatrix[i][k++] = matrix[i][j];
                }
            }
        }

        return modifiedMatrix;
    }

    // Method to check if a matrix has unique rows
    private static boolean hasUniqueRows(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows - 1; i++) {
            for (int j = i + 1; j < rows; j++) {
                boolean isDuplicate = true;
                for (int k = 0; k < columns; k++) {
                    if (matrix[i][k] != matrix[j][k]) {
                        isDuplicate = false;
                        break;
                    }
                }
                if (isDuplicate) {
                    return false;
                }
            }
        }

        return true;
    }
}
