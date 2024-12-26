package infoprep;

import java.util.Arrays;

public class SelectionSort {
    public static int minimum(int[] arr,int i){
        int min = Integer.MAX_VALUE;
        for(int j = i;j<arr.length;j++){
            if(min>arr[j]){
                min=arr[j];
            }
        }
        return min;
    }
    public static int miniIndex(int[] arr,int i){
        int min = Integer.MAX_VALUE;int k = 0;
        for(int j = i;j<arr.length;j++){
            if(min>arr[j]){
                min=arr[j];
                k=j;
            }
        }
        return k;
    }
    public static void swap(int[] arr,int i,int j,int value){
        int temp = arr[i];
        arr[i]=value;
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,7,5,9,10,1};
        for(int i = 0;i<arr.length;i++){
            int min = minimum(arr,i);
            int index = miniIndex(arr,i);
            swap(arr,i,index,min);
        }
        System.out.println(Arrays.toString(arr));
    }
}
