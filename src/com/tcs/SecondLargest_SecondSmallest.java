package com.tcs;

import java.util.Arrays;

public class SecondLargest_SecondSmallest {
    public static int secondSmall(int[] arr){
        int s_small=Integer.MAX_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(small>arr[i]){
                s_small=small;
                small=arr[i];continue;
            }
            if(s_small>arr[i]){
                s_small=arr[i];
            }
        }
        return s_small;

    }
    public static int secondLargest(int[] arr){
        int s_small=Integer.MIN_VALUE;
        int small=Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(small<arr[i]){
                s_small=small;
                small=arr[i];continue;
            }
            if(s_small<arr[i]){
                s_small=arr[i];
            }
        }
        return s_small;
    }

    public static void main(String[] args) {
        int arr[] = {1 ,2 ,3 ,4 ,5 ,6, 7 ,8 ,9 ,10 };
        int[] arr1 = new int[2];
        int small = secondSmall(arr);
        int largest=secondLargest(arr);
        arr1[0]=small;arr1[1]=largest;
        System.out.println(Arrays.toString(arr1));
    }
}
