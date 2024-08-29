package com.tcs;

import java.util.Arrays;

public class prbm20{
    public static void main(String[] args) {
       int array[] = {3,7,8,9,10,11};
       int[] array1=Arrays.copyOf(array,array.length);
        int k = 3;
        int subArray=array.length-k-1;
        System.out.println(subArray);//(7-3)
        int count = 0;
        for(int i = subArray+1;i<array.length;i++){
            array[count]=array[i];count++;
        }
        for(int i = 0;i<=subArray;i++){
            array[count]=array1[i];count++;
        }

        System.out.println(Arrays.toString(array));
    }
}
