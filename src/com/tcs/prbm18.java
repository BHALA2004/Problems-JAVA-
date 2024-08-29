package com.tcs;

import java.util.*;

public class prbm18 {
    public static void main(String[] args) {
       int[] arr =  {20, 15, 26, 2, 98, 6};
      int[] arr1 = {20, 15, 26, 2, 98, 6};

      Arrays.sort(arr);
      int count = 0;
        Map<Integer,Integer> s = new HashMap();List<Integer> s1 = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if(!s.containsKey(arr[i])){
                s.put(arr[i],++count);
            }
        }
        for(int i = 0; i < arr1.length; i++){
            s1.add(s.get(arr1[i]));
        }

//        for(Map.Entry<Integer,Integer> hash : s.entrySet()){
//            for(int i = 0;i<arr1.length;i++){
//                if(arr[i]==hash.getKey()){
//                    s1.add(hash.getValue());
//                }
//            }
//        }
        System.out.println(s1);





    }
}
