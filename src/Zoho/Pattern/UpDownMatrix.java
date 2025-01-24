public class UpDownMatrix {

    public static void DowntoUp(int[][] matrix,int i,int j,boolean[][] booleans){
        if(i<0 || j<0 || i>=matrix.length || j>=matrix[0].length){
            return;
        }
        if(booleans[i][j]==true){
            return;
        }
        DowntoUp(matrix,i+1,j-1,booleans);
        booleans[i][j]=true;
        System.out.print(matrix[i][j]+" ");
    }
    public static void UptoDown(int[][] matrix,int i,int j,boolean[][] booleans){
        if(i<0 || j<0 || i>=matrix.length || j>=matrix[0].length){
            return;
        }
        if(booleans[i][j]==true){
            return;
        }
        System.out.print(matrix[i][j]+" ");
        booleans[i][j]=true;
        UptoDown(matrix,i+1,j-1,booleans);
    }
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3,10},
                           {4 ,5 ,6,11},
                           {7, 8, 9,12}};
        boolean[][] booleans = new boolean[matrix.length][matrix[0].length];
        boolean flipflop = false;
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[0].length;j++){
                if(flipflop==false && booleans[i][j]==false){
                    DowntoUp(matrix,i,j,booleans);
                    flipflop=true;
                }
                else if(flipflop==true && booleans[i][j]==false){
                    UptoDown(matrix,i,j,booleans);
                    flipflop=false;
                }
            }
        }

    }
}
