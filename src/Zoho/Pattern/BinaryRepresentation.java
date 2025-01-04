package Zoho.Pattern;

import java.util.Arrays;

public class BinaryRepresentation {
    public static void main(String[] args) {
        int n = 639;int count = 1;
        int[] arr = new int[9];
        while (n>0){
            int r = n%10;
            for(int i = 0;i<r;i++){
                arr[i]+=count;
            }
            count*=10;
            n/=10;
        }
        System.out.println(Arrays.toString(arr));
    }
}
