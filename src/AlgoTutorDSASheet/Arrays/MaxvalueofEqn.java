package AlgoTutorDSASheet.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxvalueofEqn {
    public static int[] findNext(int[][] points,int index){
        return points[index];
    }
    public static List<Integer> mainFunction(int[][] points, int k, int index,List<Integer> list,int[] next,int ActualIndex){
        if(index==ActualIndex){
            return list;
        }
        int[] val1 = next;
        int[] val2 = findNext(points,index+1);
        int xValue = Math.abs(val1[0]-val2[0]);
        if(xValue<=k){
            int res = val1[1]+val2[1]+xValue;
            list.add(res);
        }
        return mainFunction(points,k,index+1,list,next,ActualIndex);

    }

    public static int findMaxValueOfEquation(int[][] points, int k) {
        List<List<Integer>> arrayList = new ArrayList<>();int index = 0;int actualIndex= points.length-1;
        List<Integer> result = new ArrayList<>();
        for(int[] val : points){
            result = mainFunction(points,k,index,new ArrayList<>(),val,actualIndex);
            index++;
            arrayList.add(result);
        }
        int max = Integer.MIN_VALUE;
        for(List<Integer> l : arrayList){
            for(int m : l){
                max=Math.max(max,m);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] points = {{1,3},{2,0},{5,10},{6,-10}};int
                k =1;
//        List<List<Integer>> list = findMaxValueOfEquation(points,k);
//        for(List<Integer> l : list){
//            System.out.println(l);
//        }
        System.out.println(findMaxValueOfEquation(points,k));

    }
}
