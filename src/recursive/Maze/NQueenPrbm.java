package recursive.Maze;

public class NQueenPrbm {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] arr = new boolean[n][n];
        System.out.println(queen(arr,0));
    }
    public static int queen(boolean[][] board,int row){
        if(row== board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        for(int col = 0; col <board.length; col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=queen(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }

    public static boolean isSafe(boolean[][] board,int row ,int col){
        //Vertical Check
        for(int i = 0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        //Diagonal Left
        int min = Math.min(row,col);
        for(int i = 1;i<=min;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        //Diagonal Right
        int max = Math.min(row,board.length-1-col);
        for(int i = 1;i<=max;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    public static void display(boolean[][] board){
        for(int i = 0;i< board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}
