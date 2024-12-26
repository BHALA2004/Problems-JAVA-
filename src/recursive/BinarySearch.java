package recursive;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,2,7,1};
        Arrays.sort(arr);
        int search = 10;int s = 0  ,e = arr.length-1;
        System.out.println(searching(arr,search,s,e));

    }
    public static boolean searching(int[] arr,int search,int s,int e){
        if(s>e){
            return false;
        }
        int mid = s+(e-s)/2;
        if(arr[mid]==search){
            return true;
        }
        if(arr[mid]>search){
            return searching(arr,search,s,mid-1);
        }
        return searching(arr,search,mid+1,e);
    }
}
