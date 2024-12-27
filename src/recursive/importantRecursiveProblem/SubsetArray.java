package recursive.importantRecursiveProblem;

import java.util.ArrayList;

public class SubsetArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        subset(arr,0,new ArrayList<>());
        System.out.println(list);
    }
    public static void subset(int[] arr,int index,ArrayList<Integer> list){
         if(index==arr.length){
             System.out.println(list);
             return;
         }
         list.add(arr[index]);
         subset(arr,index+1,list);
         list.remove(list.size()-1);
         subset(arr,index+1,list);
    }
}
