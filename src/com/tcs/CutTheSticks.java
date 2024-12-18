package com.tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CutTheSticks {
    public static int max(List<Integer> list){
       Collections.sort(list);
       int val = 0;
       for(int i : list){
           if(i!=0){
               val=i;break;
           }
       }
       return val;
    }
    public static int count(List<Integer> var){
        int count  = 0;
        for(int i : var){
            if(i!=0){
                count++;
            }
        }
        return count;
    }
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        List<Integer> newList = new ArrayList<>(list.size());
        for(int  i  =0;i<newList.size();i++){
            newList.add(0);
        }
        while (!arr.equals(newList)){
            int m = max(arr);
            for(int i = 0;i<arr.size();i++){
                if(arr.get(i)!=0){
                    arr.set(i,arr.get(i)-m);
                }
            }
            int k = count(arr);
            list.add(k);
        }
        return list;




    }
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>(Arrays.asList(5,4,4,2,2,8));
        List<Integer> integers = cutTheSticks(list);
        System.out.println(integers);
    }
}
