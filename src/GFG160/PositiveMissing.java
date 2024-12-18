package GFG160;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PositiveMissing {
    public static int missingNumber(int[] arr) {
        // Your code here
        Arrays.sort(arr);
        int gm = arr[arr.length-1];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>0){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        if(list.isEmpty()){
            return 1;
        }
        int g = list.get(list.size()-1);
        for(int i = 1;i<g;i++){
            if(!list.contains(i)){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
       int arr[] ={-8, 0, -1, -4, -3};
        System.out.println(missingNumber(arr));

    }
}
