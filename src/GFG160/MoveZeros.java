package GFG160;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {
    public static void pushZerosToEnd(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(i!=0){
                list.add(i);
            }
        }
        int zero = arr.length-list.size();
        for(int i = 0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        for(int i = list.size();i< arr.length;i++){
            arr[i]=0;
        }
    }
    public static void main(String[] args) {
       int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
       pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
