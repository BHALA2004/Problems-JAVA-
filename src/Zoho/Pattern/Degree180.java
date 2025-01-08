package Zoho.Pattern;

import java.util.Arrays;

public class Degree180 {
    public static void reverse(int[] mat,int l,int r){
        while (l<=r){
            int temp = mat[l];
            mat[l]=mat[r];
            mat[r]=temp;
            l++;r--;
        }
    }
    public static void main(String[] args) {
        int[][] mat ={
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 1, 2},
                {3, 4, 5, 6}
        };

        int l = 0;
        int r = mat.length-1;
        while (l<=r){
            int[] temp1 = mat[l];
            int[] temp2 = mat[r];
            reverse(temp1,0,mat[0].length-1);
           reverse(temp2,0,mat[0].length-1);
            int[] actual = mat[l];
            mat[l] = mat[r];
            mat[r]=actual;
            l++;r--;
        }
        if(mat.length%2==1){
            int r1 = mat.length%2;
            reverse(mat[r1],r1/2, mat[0].length-1);
        }
        for(int[ ] i : mat){
            System.out.println(Arrays.toString(i));
        }
    }
}
