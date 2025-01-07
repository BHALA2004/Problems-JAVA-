package Zoho.Pattern;

import java.util.Arrays;

public class TripletSum {
    public static void main(String[] args) {

       int arr[] = {2,2,2,2,2};int target = 8;
        Arrays.sort(arr);
        int left = 1;int right = arr.length-1;
        for (int j = 0;j<=arr.length-4;j++){
        for(int i = 1;i<=arr.length-3;i++){
            while (left<=right){
                if(arr[j]+arr[i]+arr[left]+arr[right]==target){
                    System.out.println(true);System.exit(1);
                } else if (arr[j]+arr[i]+arr[left]+arr[right]>target) {
                    right--;
                }
                else {
                   left++;
                }
            }
        }}
        System.out.println(false);
    }
}
