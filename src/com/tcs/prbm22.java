package com.tcs;

import java.util.HashMap;
import java.util.Map;

public class prbm22 {
    public static void main(String[] args) {
        int array[] = {6,7,9,5,3,10} ,k=10;
        Map<Integer,Integer> hash = new HashMap<>();
        for(int i = 0;i<array.length;i++){
            hash.put(array[i],i);
        }
        for(Map.Entry<Integer,Integer> map : hash.entrySet()){
            if(k==map.getKey()){
                System.out.println(map.getValue());break;
            }
        }

    }
}
