package com.tcs;

public class prbm1 {
    public static void main(String[] args) {
        int arr[] = {8,10,5,7,9};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);

        }
        System.out.println(min);
    }
}
