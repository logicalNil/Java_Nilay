package Easy;

import java.util.List;
import java.util.ArrayList;

public class KidsWithGreatestNumberofCandies {
    public static void main(String[] args) {
        KidsWithGreatestNumberofCandies k = new KidsWithGreatestNumberofCandies();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(k.kidsWithCandies(candies,extraCandies));
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int max = 0;
        for(int i:candies) max = Math.max(i,max);

        for(int i:candies)
            result.add(i+extraCandies>=max);
        return result;
    }
}
