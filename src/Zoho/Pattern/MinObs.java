package Zoho.Pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MinObs {
    public static void main(String[] args) {
        int[] arr = {11,15,24,9};
        Arrays.sort(arr);
        List<int[]> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j< arr.length;j++){
                if(min>=Math.abs(arr[i]-arr[j])){
                    min=Math.abs(arr[i]-arr[j]);
                    int[] temp = new int[]{arr[i],arr[j]};
                    list.add(temp);
                }
            }
        }
        for(int[] i : list){
            System.out.println(Arrays.toString(i));
        }
    }
}
