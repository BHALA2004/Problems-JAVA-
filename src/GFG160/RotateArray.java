package GFG160;

import java.util.Arrays;
import java.util.List;

public class RotateArray {
    public static void rotateArr(int arr[], int d) {
        // add your code here
        while (d> arr.length){
            d%=arr.length;
        }
        int count=0;
        int[] arr1 = new int[arr.length];
        for(int i = d;i<arr.length;i++){
            arr1[count++]=arr[i];
        }
        for(int i = 0;i<d;i++){
            arr1[count++]=arr[i];
        }
        for(int i = 0;i<arr.length;i++){
            arr[i]=arr1[i];
        }

    }
    public static void main(String[] args) {
        int arr[] = {7, 3, 9, 1};int d = 9;
        rotateArr(arr,d);
        System.out.println(Arrays.toString(arr));
    }
}
