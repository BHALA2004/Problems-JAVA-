package Zoho.Pattern;

import java.util.Arrays;

public class ImageRotation {
    public static void reverse(int[][] matrix,int i){
        int l = 0;int r = matrix[0].length-1;
        while (l<=r){
            int temp = matrix[i][l];
            matrix[i][l]=matrix[i][r];
            matrix[i][r]=temp;
            l++;r--;
        }
    }
    public static void swap(int[][] matrix,int i,int j,int m,int n){
        int temp = matrix[i][j];
        matrix[i][j]=matrix[m][n];
        matrix[m][n]=temp;
    }
    public static void Transpose(int[][] matrix){

        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<i;j++){
                swap(matrix,i,j,j,i);
            }
        }
    }
    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {4,5,6}, {7,8,9}};
        int n = input.length;
        Transpose(input);
        for(int i = 0;i<input.length;i++){
            reverse(input,i);
        }
        for(int[] i : input){
            System.out.println(Arrays.toString(i));
        }

    }
}
