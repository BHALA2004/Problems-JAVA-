import java.util.Arrays;

public class rotateBy90Degree {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = {{1, 2, 3}, {4, 5, 6},{7, 8, 9}};
        int[][] temp = new int[n][n];
        for(int i = 0 ;i<n;i++){
            for(int j = 0;j<n;j++){
                temp[i][j]=matrix[i][j];
            }
        }
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                matrix[i][j]=temp[j][n-i-1];
            }
        }
        for(int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                System.out.print(matrix[i][j] );
            }
            System.out.println();
        }

    }
}
