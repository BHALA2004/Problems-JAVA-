package com.tcs;

import java.util.*;

public class getTotalX {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<List<Integer>> arr = new ArrayList<>();

        for(int j : a){
            List<Integer> arr1= new ArrayList<>();
            for(int i=1;i<b.get(b.size()-1);i++){
                arr1.add(i*j);

            }
           // System.out.println(arr1);
            arr.add(arr1);

        }
        for(int j : b){
            List<Integer> arr1= new ArrayList<>();
            for(int i = 1;i<=j;i++){
                if(j%i==0){
                    int m = j/i;
                    arr1.add(m);
                }
            }
          //  System.out.println(arr1);
            arr.add(arr1);
           
        }
        System.out.println(arr);
        int in = 0;
        List<Integer> list = arr.get(0);
        int count = 1;int i = 0;
        while (count<arr.size() && i<list.size()){
            if(arr.get(count).contains(list.get(i))){
                count++;
                if(count==arr.size()-1){
                    in++;count=1;
                }
            }
            else {
                count=1;i++;
            }

        }


        return in;

    }
    public static void main(String[] args) {


        List<Integer> arr1 = new ArrayList<>(Arrays.asList( 2 ,4));
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(16 ,32 ,96));
       int m = getTotalX(arr1,arr2);
        System.out.println(m);
    }
}
