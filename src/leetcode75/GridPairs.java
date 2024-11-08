package leetcode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridPairs {
    public static int count(int[][] grid , int[] val){
        int re = 0;
        int n = grid.length;
        for(int i = 0;i<n;i++){
            int[] x = new int[n];
            for(int j = 0;j<n;j++){
                x[j]=grid[j][i];
            }
            if(Arrays.equals(x,val)){
                re+=1;
            }
        }

        return re;
    }
    public static int equalPairs(int[][] grid) {
        int count=0;
        for(int[] i : grid)
            count+=count(grid,i);
        return count;


    }
    public static void main(String[] args) {
       int[][] grid = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
       int result = equalPairs(grid);
        System.out.println(result);
    }
}
