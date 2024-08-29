package com.tcs;

import java.util.Arrays;
import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
       int arr[] = {2,2,3,4,4,2};
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
        }System.out.println(hashMap);
//        Arrays.sort(arr);
//        int n = arr.length;
//        int[] arr1 = new int[n];
//        for(int i = 0;i<arr1.length;i++){
//            arr1[arr[i]]++;
//        }
//        System.out.println(Arrays.toString(arr1));





    }
}
