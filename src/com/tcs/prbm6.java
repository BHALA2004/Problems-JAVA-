package com.tcs;

import java.util.Arrays;

public class prbm6 {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 8 ,6 ,15, 5 ,9 ,20};
        Arrays.sort(arr);
        int n = arr.length/2;
        int start = n;
        int end = arr.length-1;
        while (start<=end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;start++;end--;

        }
        System.out.println(Arrays.toString(arr));
    }

}
