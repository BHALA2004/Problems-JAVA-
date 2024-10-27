package leetcode75;

import java.util.ArrayList;
import java.util.List;

public class KidChoco {
    public static int max(int[] candy){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<candy.length;i++){
            max=Integer.max(max,candy[i]);
        }
        return max;
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxi = max(candies);
        //System.out.println(maxi);
        for(int i = 0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maxi){
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] candies = {12,1,12};int extraCandies = 10;
        List<Boolean> m = kidsWithCandies(candies,extraCandies);
        System.out.println(m);
    }
}
