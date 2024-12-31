package recursive.Maze;

import java.util.Arrays;

public class BacktrackingBasic {
    public static void main(String[] args) {
        boolean[][] arr = {{true,true,true},{true,true,true},{true,true,true}};
       findRouteWithRestriction("",0,0,arr);
        int[][] path = new int[arr.length][arr[0].length];
        findRouteWithRestrictionRouteMatrix("",0,0,arr,path,1);
    }


    //Backtracking invloves
    public static void findRouteWithRestriction(String p, int r, int c,boolean[][] arr){
        if(r== arr.length-1 && c==arr[0].length-1){
            System.out.println(p);return;
        }
        if(!arr[r][c]){
            return;
        }
        arr[r][c]=false;
        if(r< arr.length-1){
            findRouteWithRestriction(p+"D",r+1,c,arr);}
        if ( c< arr[0].length-1) {
            findRouteWithRestriction(p+"R",r,c+1,arr);
        }
        if(r>0){
            findRouteWithRestriction(p+"U",r-1,c,arr);
        }
        if(c>0){
            findRouteWithRestriction(p+"L",r,c-1,arr);
        }
        arr[r][c]=true;

    }


    //Backtracking and print it as Matrix
    public static void findRouteWithRestrictionRouteMatrix(String p, int r, int c,boolean[][] arr,int[][] path,int step){
        if(r== arr.length-1 && c==arr[0].length-1){
            path[r][c]=step;
            for(int[] array : path){
                System.out.println(Arrays.toString(array));
            }
            System.out.println(p);
            System.out.println();
            path[r][c]=0;
            return;
        }
        if(!arr[r][c]){
            return;
        }
        arr[r][c]=false;
        path[r][c]=step;
        if(r< arr.length-1){
            findRouteWithRestrictionRouteMatrix(p+"D",r+1,c,arr,path,step+1);}
        if ( c< arr[0].length-1) {
            findRouteWithRestrictionRouteMatrix(p+"R",r,c+1,arr,path,step+1);
        }
        if(r>0){
            findRouteWithRestrictionRouteMatrix(p+"U",r-1,c,arr,path,step+1);
        }
        if(c>0){
            findRouteWithRestrictionRouteMatrix(p+"L",r,c-1,arr,path,step+1);
        }
        arr[r][c]=true;
        path[r][c]=0;

    }
}
