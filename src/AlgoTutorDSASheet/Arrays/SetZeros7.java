package AlgoTutorDSASheet.Arrays;

import java.util.Arrays;

public class SetZeros7 {
    public static void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<col.length;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }



    }
    public static void main(String[] args) {
       int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
       setZeroes(matrix);
       for(int[] i : matrix){
           System.out.println(Arrays.toString(i));
       }
    }
}
