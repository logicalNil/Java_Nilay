import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the order of the matrix
        int n = scanner.nextInt();

        // Read the matrix elements
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Find the saddle point
        boolean hasSaddlePoint = false;
        int saddlePointRow = -1;
        int saddlePointColumn = -1;

        for (int i = 0; i < n; i++) {
            int minInRow = matrix[i][0];
            int columnIndex = 0;

            // Find the minimum element in the current row
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < minInRow) {
                    minInRow = matrix[i][j];
                    columnIndex = j;
                }
            }

            // Check if the minimum element is also the maximum in its column
            boolean isSaddlePoint = true;
            for (int k = 0; k < n; k++) {
                if (matrix[k][columnIndex] > minInRow) {
                    isSaddlePoint = false;
                    break;
                }
            }

            if (isSaddlePoint) {
                hasSaddlePoint = true;
                saddlePointRow = i;
                saddlePointColumn = columnIndex;
                break;
            }
        }

        // Print the result
        if (hasSaddlePoint) {
            System.out.println("Saddle point is in (" + saddlePointRow + ", " + saddlePointColumn +
                    ") and the value is " + matrix[saddlePointRow][saddlePointColumn]);
        } else {
            System.out.println("No saddle point");
        }
    }
}
