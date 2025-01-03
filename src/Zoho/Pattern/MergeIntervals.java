package Zoho.Pattern;

import java.util.Arrays;

public class MergeIntervals {
    public static void MakeSwap(int[][]swap,int i,int j){
        int[] temp = swap[i];
        swap[i]=swap[j];
        swap[j]=temp;
        //Arrays.sort(swap,(a,b)->a[0]-b[0]);
    }
    public static void swap(int[][] swap){
        for(int i = 0;i<swap.length;i++){
           for(int j = i+1;j<swap.length;j++){
               if(swap[i][0]>swap[j][0]){
                  MakeSwap(swap,i,j);
               }
           }
        }
    }
    public static void main(String[] args) {
        int[][] input = {{1,4},{4,5}};int count = 0;
        int[][] newone = new int[input.length][];
        swap(input);
        int max = Integer.MIN_VALUE;
        int index = 0;int n = input.length;
        while (index<input.length){
            int start = input[index][0];
            int end = input[index][1];
            while (index<n-1 && end>= input[index+1][0]){
                end=Math.max(end,input[index+1][1]);
                index++;
            }
            int[] temp = new int[]{start,end};
            newone[count++]=temp;
            index++;
        }
        for(int[] i : newone){
            System.out.println(Arrays.toString(i));
        }
    }
}
