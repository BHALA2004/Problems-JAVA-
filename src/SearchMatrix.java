import java.util.ArrayList;
import java.util.List;

public class SearchMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;
        List<Integer> list  =new ArrayList<>();
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    result=true;

                }
            }
        }
//        System.out.println(matrix.length);
//        System.out.println(matrix[0].length);
        return result;


    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3}};

        boolean result = searchMatrix(matrix,3);
        System.out.println(result);

    }
}
