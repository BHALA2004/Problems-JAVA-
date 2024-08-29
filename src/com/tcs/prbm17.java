package com.tcs;

public class prbm17 {
    public static void main(String[] args) {
        int[] arr = {-2, 3, -4, 0};int count = 1;
        int result = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            count=1;
            for(int j=i;j<arr.length;j++){
                count*=arr[j];
                result=Math.max(result,count);
            }

        }
        System.out.println(result);
    }
}
