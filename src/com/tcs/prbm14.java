package com.tcs;

import java.util.HashMap;
import java.util.Map;


    public class prbm14 {
        public static void main(String[] args) {
            int Arr[] = {1,1,0};
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            for(int i=0;i<Arr.length;i++){
                hashMap.put(Arr[i],hashMap.getOrDefault(Arr[i],0)+1);
            }
            for (Map.Entry<Integer,Integer> hash : hashMap.entrySet()){
                if(hash.getValue()>1){
                    System.out.println(hash.getKey());
                }

            }
        }
    }

