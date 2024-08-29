package com.tcs;



public class prbm9 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};int sum=0;
       for(int i = 0;i<array.length;i++){
           sum+=array[i];
       }
        System.out.println((float)sum/array.length);
    }
}
