import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After Rotate Image");
        int[][] temp = new int[matrix.length][matrix.length];
        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                temp[i][j]=matrix[i][j];
            }
        }

        for(int i = 0;i< matrix.length;i++){
            int count = matrix.length-1;
            for(int j=0;j< matrix.length;j++){
                matrix[i][j]=temp[count][i];count--;
            }
        }
        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
