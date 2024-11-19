package tcs;

import java.util.ArrayList;
import java.util.List;

public class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int lsum = 0;
        int rsum=0;
        for(int i = 0;i<arr.size();i++){
            for(int j = 0;j<arr.size();j++){
                if(i==j){
                    lsum+=arr.get(i).get(j);
                }if (i==Math.abs((arr.size()-(j+1)))) {
                    rsum+=arr.get(i).get(j);
                }
            }
        }
return Math.abs(lsum-rsum);

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> var = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        var.add(list);
        list1.add(4);list1.add(5);list1.add(6);
        var.add(list1);
        list2.add(9);list2.add(8);list2.add(9);
        var.add(list2);
        System.out.println(var);
        int result = diagonalDifference(var);
        System.out.println(result);



    }
}
