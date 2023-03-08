package HW;

public class KokoEatingBananas_875 {
    public int minEatingSpeed(int[] piles, int H) {
        int left = 1;
        int right = 0;
        for (int i = 0; i < piles.length; i++) {
            right = Math.max(right, piles[i]);
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (check(piles, H, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean check(int[] piles, int H, int speed) {
        int time = 0;
        for (int i = 0; i < piles.length; i++) {
            time += piles[i] / speed;
            if (piles[i] % speed != 0) {
                time++;
            }
        }
        return time <= H;
    }

    public static void main(String[] args) {
        KokoEatingBananas_875 kokoEatingBananas_875 = new KokoEatingBananas_875();
        int[] piles = {3, 6, 7, 11};
        int H = 8;
        System.out.println(kokoEatingBananas_875.minEatingSpeed(piles, H));
    }
}
