package com.tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prbm11 {
    public static void main(String[] args) {
         int[] arr = {1 ,2 ,2 };
        List<Integer> list = new ArrayList<>();
         for (int i=0;i<arr.length;i++){
             if(!list.contains(arr[i])){
                list.add(arr[i]);
             }
         }
         for(int i=0;i<list.size();i++){
             arr[i]=list.get(i);
         }
        System.out.println(list);
    }
}
