package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CandlesOff {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max = Integer.MIN_VALUE;int count  = 0;
        Collections.sort(candles);
        for(int i = candles.size()-1;i>=0;i--){
            if(max<=candles.get(i)){
                count++;
                max=candles.get(i);
            }
            else {
                break;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,2,1 ,3));
        System.out.println(birthdayCakeCandles(list));
    }
}
