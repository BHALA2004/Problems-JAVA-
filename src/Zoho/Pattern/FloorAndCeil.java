package Zoho.Pattern;

import java.util.Map;

public class FloorAndCeil {
    public static int ceil(int[] arr,int n,int target){
        int max = -1;
        int l = 0,r=n-1;
        while (l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]>=target){
                max=arr[mid];r=mid-1;
            }
            else if(arr[mid]<target) {
                l=mid+1;
            }
        }
        return max;
    }
    public static int floor(int[] arr,int n,int target){
        int min = -1;
        int l = 0,r=n-1;
        while (l<=r){
            int mid = (l+r)/2;
            if(arr[mid]<=target){
                min= arr[mid];
                l=mid+1;
            } else if (arr[mid]>=target) {
                r=mid-1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[ ] arr = {1,4,6,8,10}; int x=7;
        int floor = floor(arr,arr.length,x);
        System.out.println(floor);
        System.out.println(ceil(arr, arr.length, x));
    }
}
