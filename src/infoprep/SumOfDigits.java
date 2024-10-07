package infoprep;

import java.util.ArrayList;
import java.util.List;

public class SumOfDigits {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1,2};int sum=0,sum1=0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i< arr.length;i++){
            list.add(arr[i]);
        }
        for(int i = 0;i<= arr.length;i++){
            if(!list.contains(i)){
                System.out.println(i);break;
            }
        }

    }
}
