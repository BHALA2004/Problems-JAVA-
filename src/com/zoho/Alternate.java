package com.zoho;

import java.util.Arrays;

public class Alternate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};int start = 0;int end = arr.length-1;int[] m = new int[arr.length];
        for(int i = 0;i<arr.length;i+=2){
            m[i]=arr[end];end--;
        }
        for(int i = 1;i<arr.length;i+=2){
            m[i]=arr[start];start++;
        }
        System.out.println(Arrays.toString(m));

    }
}
