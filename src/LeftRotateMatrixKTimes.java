public class LeftRotateMatrixKTimes {
    public static int[][] rotatinguuu(int[][] matrix,int k){
        int[][] result = new int[matrix.length][matrix[0].length];

       int temp=0;


            for(int i  =0;i<matrix.length;i++){
                temp = matrix[i][0];
                for (int j = 0;j<matrix[0].length-1;j++){

                    matrix[i][j]=matrix[i][j+1];
                }
                matrix[i][matrix[0].length-1]=temp;
            }

    return result;
    }

    public static void main(String[] args) {
        int k = 1;
        int[][] matrix  = {{1,2,3},{4,5,6},{7,8,9}};
        matrix = rotatinguuu(matrix,k);

        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]  );
            }
            System.out.println();
        }
    }
}
