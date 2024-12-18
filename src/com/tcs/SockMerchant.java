package com.tcs;

import java.util.*;

public class SockMerchant {
    public static int newOne(int val ){
        if(val%2==0){
            val/=2;
        }
        else if(val%2==1){
            val-=1;
            val/=2;
        } else if (val==1) {
            val=0;
        }
        return val;
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : ar){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);int count = 0;
        for(Map.Entry<Integer,Integer> hash : map.entrySet()){
            count+=newOne(hash.getValue());
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
        int m = sockMerchant(arr.size(),arr);
        System.out.println(m);

    }
}
