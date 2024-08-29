package com.tcs;

import java.util.ArrayList;
import java.util.List;

public class prbm12 {
    public static void main(String[] args) {
        int[] arr = {4,3,9,2,4,1,10,89,34};
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
