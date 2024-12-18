package recursive;

import java.util.ArrayList;

public class PermutationI {
    public static void permuation(ArrayList<Integer> ds,ArrayList<ArrayList<Integer>> ans,int[] arr,boolean[] freq){
       if(ds.size()==arr.length){
           ans.add(new ArrayList<>(ds));
           return;
       }
       for(int i = 0;i<arr.length;i++){
           if(freq[i]==false){
           freq[i]=true;
           ds.add(arr[i]);
           permuation(ds,ans,arr,freq);
           ds.remove(ds.size()-1);
           freq[i]=false;
       }}
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
       int[ ] arr = {1,2,3,4};
       boolean[] freq = new boolean[arr.length];
       permuation(new ArrayList<>(),lists,arr,freq);
        System.out.println(lists);


    }
}
