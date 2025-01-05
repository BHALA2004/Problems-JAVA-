package Zoho.Pattern;

import java.util.Arrays;

public class SwapKelements {
    static int[] swap(int[] arr,int start,int stop)
    {
        while(start<=stop)
        {
            int temp=arr[start];
            arr[start]=arr[stop];
            arr[stop]=temp;
            start++;
            stop--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]= {10,12,13,15,9,5,44,33};
        int k=3;
        for(int i = 0;i<=arr.length-1;i+=3){
            try {
                swap(arr,i,i+2);
            }
            catch (Exception e){
                swap(arr,i, arr.length-1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
