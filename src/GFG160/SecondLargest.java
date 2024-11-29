package GFG160;

import java.util.*;

public class SecondLargest {
    public static int  getSecondLargest(int[] arr){
        Set<Integer> integerSet = new TreeSet<>();
        for(int i : arr){
            integerSet.add(i);
        }
        List<Integer> list = new ArrayList<>(integerSet);
        if(list.size()==1){
            return -1;

        }
        else {
            return list.get(list.size()-2);
        }



    }
    public static void main(String[] args) {
        int arr[] = {10, 10,10};
        int result = getSecondLargest(arr);
        System.out.println(result);

    }
}
