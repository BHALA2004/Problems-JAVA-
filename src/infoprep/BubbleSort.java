package infoprep;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,2,7,5,9,10,1};
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[1]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
    }
    public static int max(int[] arr){
        int min = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            min=Math.max(arr[i],min);
        }
        return min;
    }
}
