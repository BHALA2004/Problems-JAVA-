package recursive.ReturnArrayList;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchReturnList {
    public static void main(String[] args) {
        int[] ar = {1,2,4,5,2,6,5,5};int target = 5;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(check(ar,target,0,list));


    }
    public static List<Integer> check(int[] arr, int target, int index, ArrayList<Integer> arrayList){
        if(arr[index]==target){
            arrayList.add(index+1);
        }
        if(index==arr.length-1){
            return arrayList;
        }
        return check(arr,target,index+1,arrayList);
    }
}
