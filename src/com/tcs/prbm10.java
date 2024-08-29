package com.tcs;

import java.util.Arrays;

public class prbm10 {
    public static void main(String[] args) {

        int[] arr =  {2,5,1,7};
        int n = arr.length;
        Arrays.sort(arr);
        if(n%2==0){
            int mid = arr.length/2;
            int prev = mid-1;
            System.out.println((float) (arr[mid]+arr[prev])/2);

        }
        else {
            int mid = arr.length/2;
            System.out.println(arr[mid]);
        }


    }
}
