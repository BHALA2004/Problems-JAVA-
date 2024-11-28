package recursive;

import java.util.ArrayList;

public class SubsetSumI {
    public static void subset(int index,int sum,int[] arr,int n,ArrayList<Integer> list){
        if(index==n){
            list.add(sum);
            return;
        }
        subset(index+1,sum+arr[index],arr,n,list);
        subset(index+1,sum,arr,n,list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {3,1,2};
        subset(0,0,arr,arr.length,list);
        System.out.println(list);
    }
}
