package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Arr_4 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements
        int numElements = scanner.nextInt();

        // Create an array to store the student marks
        int[] marks = new int[numElements];

        // Read the marks
        for (int i = 0; i < numElements; i++) {
            marks[i] = scanner.nextInt();
        }

        // Create an array to store the count of students in each range
        int[] rangeCounts = new int[11]; // 11 ranges from 0-9 to 90-100

        // Iterate through the marks and count the students in each range
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                rangeCounts[10]++; // Invalid range
            } else {
                int rangeIndex = mark / 10;
                rangeCounts[rangeIndex]++;
            }
        }

        // Print the count of students in each range
        String[] rangeLabels = { "0-9", "10-19", "20-29", "30-39", "40-49", "50-59", "60-69", "70-79", "80-89", "90-100", "Invalid" };
        for (int i = 0; i < rangeCounts.length; i++) {
            System.out.println(rangeLabels[i] + ": " + rangeCounts[i]);
        }
    }
}
