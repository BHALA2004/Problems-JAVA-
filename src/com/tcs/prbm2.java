package com.tcs;

public class prbm2 {
    public static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        return max;

    }
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,0};
        int largest = largestElement(arr,arr.length);
        System.out.println(largest);
    }
}
