package HW;
import java.util.Scanner;

public class BestTimetoBuyandSellStock_121 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        BestTimetoBuyandSellStock_121 obj1 = new BestTimetoBuyandSellStock_121();
        int prices;
        System.out.println("Enter the number of prices: ");
        prices = obj.nextInt();
        int[] pricesArray = new int[prices];

        System.out.println("Enter the prices: ");
        for (int i = 0; i < prices; i++) {
            pricesArray[i] = obj.nextInt();
        }
        System.out.println("The maximum profit is: " + obj1.maxProfit(pricesArray));
    }
}
