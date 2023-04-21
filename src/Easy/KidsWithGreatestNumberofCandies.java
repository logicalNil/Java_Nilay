package Easy;

import java.util.List;
import java.util.ArrayList;

public class KidsWithGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max) max = candies[i];
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max) res.add(true);
            else res.add(false);
        }
        return res;
    }
    public static void main(String[] args) {
        KidsWithGreatestNumberofCandies kwc = new KidsWithGreatestNumberofCandies();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kwc.kidsWithCandies(candies, extraCandies));
    }
}
