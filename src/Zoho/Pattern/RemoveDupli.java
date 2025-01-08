package Zoho.Pattern;

import java.util.Arrays;

public class RemoveDupli {
    public static void main(String[] args) {
        int[] arr = {1,5,3,5,1,2,6};
        int[] arr1 = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            arr1[arr[i]]=1;

        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]==1){
                System.out.print(i+" ");
            }
        }
    }
}
