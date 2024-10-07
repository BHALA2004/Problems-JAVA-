package com.tcs;

import java.util.Arrays;

public class AlternateSorting {
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
    }
    public static void main(String[] args) {
        int[] arr =  {1, 2, 3, 4, 5, 6};
        int[] copyArr = Arrays.copyOf(arr,arr.length);
        reverse(copyArr);int count =0;
        for(int i = 0;i<arr.length/2;i++){
            System.out.print(copyArr[i]+" "+arr[i]+" ");
        }
        if(arr.length%2==1){
            System.out.print(arr[arr.length/2]);
        }


    }
}
