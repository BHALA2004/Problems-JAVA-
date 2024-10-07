package com.zoho;

public class ShuffleString {
    public static void main(String[] args) {
        String g = "codeleet";String x = "";
        int[] arr = {4,5,6,7,0,1,2,3};
        for(int i = 0;i<arr.length;i++){
            x+=g.charAt(arr[i]);
        }
        System.out.println(x);

        int n = 11;
        for(int i = 2;i<n;i++){
            if(n%i==0){
                System.out.println("false");break;

            }
            else{
                System.out.println("true");
            }
        }

    }
}
