package HW;

import java.util.Scanner;
/**
 * @author : Nilay
 * @date 2023/3/20 21:00
 * @description
 */



public class CanPlaceFlowers_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                if (next == 0 && prev == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size：");
        int x = scanner.nextInt();
        if (x == 0) {
            System.out.println(true);
        } else {
            System.out.println("Enter Array：");
        int[] flowerbed = new int[x];
        for (int i = 0; i < x; i++) {
            flowerbed[i] = scanner.nextInt();
        }
            System.out.print("Enter n：");
        int n = scanner.nextInt();
            System.out.println(new CanPlaceFlowers_605().canPlaceFlowers(flowerbed, n));
        }
    }
}
