package recursive;

import java.util.*;

public class SubsetII {
    public static void getNonduplisubset(int index, int[] arr, ArrayList<Integer> list,ArrayList<ArrayList<Integer>> listArrayList,int n){
        if(index==n){
            listArrayList.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[index]);
        getNonduplisubset(index+1,arr,list,listArrayList,n);
        list.remove(list.size()-1);
        getNonduplisubset(index+1,arr,list,listArrayList,n);
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        ArrayList<ArrayList<Integer>> listArrayList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        getNonduplisubset(0,arr,list,listArrayList,arr.length);
        Set<ArrayList<Integer>> set = new LinkedHashSet<>(listArrayList);

        System.out.println(set);

    }
}
