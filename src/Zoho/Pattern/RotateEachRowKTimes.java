package Zoho.Pattern;

import java.util.Arrays;

public class RotateEachRowKTimes {
    public static void reverse(int[][] mat,int l,int r,int i){
        while (l<=r){
            int temp = mat[i][l];
            mat[i][l]=mat[i][r];
            mat[i][r]=temp;
            l++;r--;
        }
    }
    public static int[][] rotateMatrix(int k, int mat[][]) {
        int r = mat.length;
        int c = mat[0].length;
        k%=c;
        for(int i = 0;i<r;i++){
            reverse(mat,0,k-1,i);
            reverse(mat,k,c-1,i);
            reverse(mat,0,c-1,i);
        }
        return mat;
    }
    public static void main(String[] args) {
        int k=1;int[][] mat={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr = rotateMatrix(k,mat);
        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }
    }
}
