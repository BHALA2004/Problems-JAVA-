package recursive;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,2,7,5,9,10,1};
        for(int i = 0;i<arr.length-1;i++){
            sort(arr,i,i+1);
        }
        System.out.println(Arrays.toString(arr));;
    }
    public static void sort(int[] arr,int i,int j){
        if(j== arr.length){
            return;
        }
        if(arr[i]>arr[j]){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        sort(arr,i,j+1);
    }
}
