package com.tcs;

import java.util.Arrays;

public class prbm8 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7} ;
        for(int j=0;j<3;j++){
        int temp = array[0];
        for(int i = 0;i<array.length-1;i++){
            array[i]=array[i+1];
        }
        array[array.length-1]=temp;}
        System.out.println(Arrays.toString(array));
    }
}
