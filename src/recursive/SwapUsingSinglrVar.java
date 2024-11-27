package recursive;

import java.util.Arrays;

public class SwapUsingSinglrVar {
    public static void swap(int[] arr,int l,int r){
        int temp = arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    public static void fun(int[] arr,int l ,int r){
        if(l>=r/2){
            return;
        }

        swap(arr,l,r-1-l);
        fun(arr,l+1,r);


    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        fun(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
