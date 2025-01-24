package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDiff {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int left = 0;
        int right = 0;
        int row = arr.size();
        int col = arr.get(0).size();
        for (int i = 0;i<row;i++){
            for (int j = 0; j < col; j++) {
                if(i==j){
                    left+=arr.get(i).get(j);
                } if ((i+j)==(row-1)) {
                    right+=arr.get(i).get(j);
                }
            }
        }

        return Math.abs(left-right);

    }
    public static void main(String[] args) {
        List<Integer> row1 = new ArrayList<>(Arrays.asList(11,2,4));
        List<Integer> row2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        List<Integer> row3 = new ArrayList<>(Arrays.asList(10,8,-12));
        List<List<Integer>> whole = new ArrayList<>();
        whole.add(row1);
        whole.add(row2);
        whole.add(row3);
        System.out.println(diagonalDifference(whole));

    }
}
