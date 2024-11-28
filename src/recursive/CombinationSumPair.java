package recursive;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSumPair {
    public static void fun(int index,int[] arr,int n , ArrayList<Integer> list,int target,ArrayList<ArrayList<Integer>> lists){
        if(index==n){
            if(target==0){
                lists.add(list);
            }
            return;
        }
        if(arr[index]<=target){
            list.add(arr[index]);
            fun(index,arr,arr.length,list,target-arr[index],lists);
            list.remove(list.size()-1);
        }
        fun(index+1,arr,arr.length,list,target,lists);
        
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {1,1,2};int target = 3;
        fun(0,arr,arr.length,list,target,lists);
        System.out.println(lists);
    }
}
