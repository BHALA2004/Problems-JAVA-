package com.tcs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class prbm15 {
    public static void main(String[] args) {
       int[] Nums = {1,2,3};
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0;i<Nums.length;i++){
            hashMap.put(Nums[i],hashMap.getOrDefault(Nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> hash : hashMap.entrySet()){
            if(hash.getValue()==1){
                System.out.println(hash.getKey());
            }
        }

    }
}
