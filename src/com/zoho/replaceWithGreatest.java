package com.zoho;

import java.util.Arrays;

public class replaceWithGreatest {
    public static int Great(int[] arr,int n,int i){
        int max=Integer.MIN_VALUE;
        for(int j = i;j<n;j++){
            max=Math.max(max,arr[j]);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int m = Great(arr,n,i+1);
            arr[i]=m;
        }
        arr[n-1]=-1;
        System.out.println(Arrays.toString(arr));

    }
}
