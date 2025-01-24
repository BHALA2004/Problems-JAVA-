package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int lowcount  = 0;
        int highcount  = 0;
        int min = scores.getFirst();
        int max = scores.getFirst();
        for(int i = 1;i<scores.size();i++){
            if(scores.get(i)>max){
                max=scores.get(i);highcount++;
            } else if (scores.get(i)<min) {
                min=scores.get(i);
                lowcount++;
            }
        }
        List<Integer> value  = new ArrayList<>();
        value.add(highcount);
        value.add(lowcount);
        return value;

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 5, 20, 20, 4 ,5 ,2, 25, 1));
        System.out.println(breakingRecords(list));
    }
}
