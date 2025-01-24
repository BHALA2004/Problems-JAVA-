import java.util.Arrays;
import java.util.Map;

public class PrintValue {
    public static void check(int[][] matrix, int i, int j, boolean[][] matrixBool) {
        // Fix boundary conditions
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) {
            return;
        }
        // Skip if already visited
        if (matrixBool[i][j]) {
            return;
        }

        // Process current cell
        System.out.print(matrix[i][j] + " ");
        matrixBool[i][j] = true;

        // Recursive call with proper index management
        check(matrix, i + 1, j - 1, matrixBool);
    }

    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        int x = 4;
        int temp = 1;
        int[] arr = new int[m*n];
        arr[0]=temp;
        for (int i = 1;i<arr.length;i++){
            temp+=x;
            arr[i]=temp;
        }
        int count=0;
        int[][] matrix = new int[m][n];
        for (int i = 0;i<m;i++){
            for (int j = 0; j < n; j++) {
               matrix[i][j]=arr[count++];
            }
        }
        for (int[] i : matrix){
            System.out.println(Arrays.toString(i));
        }

        boolean[][] matrixbool = new boolean[m][n];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                if(matrixbool[i][j]==false){
                        check(matrix,i,j,matrixbool);
                }
            }
        }





        }

    }
