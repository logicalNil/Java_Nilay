import java.util.Scanner;

public class NumberZeroFilledSubarrays_2348 {
    public long zeroFilledSubarrays(int[] nums) {
        long count = 0;
        int start = 0;
        int zeroSubarray = 0;
        for (int n : nums) {
            if (n == 0) {
                count += ++zeroSubarray;
            } else {
                zeroSubarray = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size：");
        int x = scanner.nextInt();
        if (x == 0) {
            System.out.println(0);
        } else {
            System.out.println("Enter Array：");
            int[] nums = new int[x];
            for (int i = 0; i < x; i++) {
                nums[i] = scanner.nextInt();
            }
            System.out.println(new NumberZeroFilledSubarrays_2348().zeroFilledSubarrays(nums));
        }
    }
}
