package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayDiv {
    public static int calculate(int start,int end,List<Integer> s){
        int value  = 0;
        for (int i = start; i <= end ; i++) {
            value+=s.get(i);
        }
        return value;
    }
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0;
        for (int i  = 0;i<=s.size()-m;i++){
            int sum  = calculate(i,i+m-1,s);
            if(sum==d){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(4));
        int target = 4;
        int size = 1;
        System.out.println(birthday(list,target,size));
    }
}
