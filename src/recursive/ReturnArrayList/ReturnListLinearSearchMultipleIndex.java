package recursive.ReturnArrayList;

import java.util.ArrayList;

public class ReturnListLinearSearchMultipleIndex {
    public static void main(String[] args) {
        int[] ar = {1,2,4,5,2,6,5,5};int target = 5;int index=0;
        System.out.println(searchMultipleindex(ar,target,index));
    }
    public static ArrayList<Integer> searchMultipleindex(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> left = searchMultipleindex(arr,target,index+1);
        list.addAll(left);
        return list;
    }
}
