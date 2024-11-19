package tcs;

import java.util.ArrayList;
import java.util.List;

public class PivotIndex {
    public static String balancedSums(List<Integer> arr) {
        // Write your code here
        int lsum = 0;
        for(int i : arr){
            lsum+=i;
        }
        int rsum=0;
        for(int j : arr){
            lsum-=j;
            if(lsum==rsum){
                return "Yes";
            }
            rsum+=j;
        }
        return "No";

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);list.add(6);list.add(8);list.add(11);
        System.out.println(balancedSums(list));

    }
}
